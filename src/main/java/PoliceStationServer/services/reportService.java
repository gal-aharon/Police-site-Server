package PoliceStationServer.services;

import PoliceStationServer.models.GeneralReport;
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

    public void add(GeneralReport report) {
        reportRepository.save(report.getRep());



        if (report.getAccidentRep() == null) {
            accidentReportService.add(report.getAccidentRep());
        } else if (report.getKidnappingReport() == null) {
            kidnappingReportService.add(report.getKidnappingReport());
        } else if (report.getStabbingReport() == null) {
            stabbingReportService.add(report.getStabbingReport());
        } else {
            shootingReportService.add(report.getShootingReport());
        }
    }
}
