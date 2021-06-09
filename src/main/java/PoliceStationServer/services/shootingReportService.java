package PoliceStationServer.services;


import PoliceStationServer.models.shootingReport;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class shootingReportService {
    @Autowired
    PoliceStationServer.repositories.shootingReportRepository shootingReportRepository;

    public List<shootingReport> getAll() {
        return shootingReportRepository.findAll();
    }

    public shootingReport getById(Integer id) {
        return shootingReportRepository.findByReport(id);
    }

    public void add(shootingReport shootingReport) {
        shootingReportRepository.save(shootingReport);
    }
}
