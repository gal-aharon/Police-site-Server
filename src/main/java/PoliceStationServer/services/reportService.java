package PoliceStationServer.services;

import PoliceStationServer.models.GeneralReport;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import PoliceStationServer.models.report;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class reportService {
    @Autowired
    PoliceStationServer.repositories.reportRepository reportRepository;

    @Autowired
    PoliceStationServer.services.shootingReportService shootingReportService;

    @Autowired
    PoliceStationServer.services.stabbingReportService stabbingReportService;

    @Autowired
    PoliceStationServer.services.accidentReportService accidentReportService;

    @Autowired
    PoliceStationServer.services.kidnapReportService kidnappingReportService;

    public List<report> getAll() {
        return reportRepository.findAll();
    }

    public report getNewest() {
        System.out.println("test 2 : get newest");
        return reportRepository.findAll(Sort.by(Sort.Direction.DESC, "evreporttime")).get(0);
    }

    public void add(GeneralReport report) {
        reportRepository.save(report.getRep());

        report newestReport = getNewest();

        if (report.getAccidentRep() != null) {
            report.getAccidentRep().setReport(newestReport.getReport_id());
            accidentReportService.add(report.getAccidentRep());
        } else if (report.getKidnappingReport() != null) {
            report.getKidnappingReport().setReport(newestReport.getReport_id());
            kidnappingReportService.add(report.getKidnappingReport());
        } else if (report.getStabbingReport() != null) {
            report.getStabbingReport().setReport(newestReport.getReport_id());
            stabbingReportService.add(report.getStabbingReport());
        } else {
            report.getShootingReport().setReport(newestReport.getReport_id());
            shootingReportService.add(report.getShootingReport());
        }
    }
}
