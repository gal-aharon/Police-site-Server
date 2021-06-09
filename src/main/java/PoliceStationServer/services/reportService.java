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
        System.out.println("in service");
        reportRepository.save(report.getRep());
        System.out.println("saved");

        report newestReport = getNewest();
        System.out.println("newest report" + newestReport);

        if (report.getAccidentRep() != null) {
            System.out.println("adding accident" + report.getAccidentRep());
            report.getAccidentRep().setReport(newestReport.getReport_id());
            System.out.println("adding accident3" + report.getAccidentRep());
            accidentReportService.add(report.getAccidentRep());
        } else if (report.getKidnappingReport() != null) {
            System.out.println("adding kidnapping" + report.getKidnappingReport());
            report.getKidnappingReport().setReport(newestReport.getReport_id());
            System.out.println("adding kidnapping2" + report.getKidnappingReport());
            kidnappingReportService.add(report.getKidnappingReport());
        } else if (report.getStabbingReport() != null) {
            System.out.println("adding stabbing" + report.getStabbingReport());
            report.getStabbingReport().setReport(newestReport.getReport_id());
            System.out.println("adding stabbing2" + report.getStabbingReport());
            stabbingReportService.add(report.getStabbingReport());
        } else {
            System.out.println("adding shooting" + report.getShootingReport());
            report.getShootingReport().setReport(newestReport.getReport_id());
            System.out.println("adding shooting2" + report.getShootingReport());
            shootingReportService.add(report.getShootingReport());
        }
    }
}
