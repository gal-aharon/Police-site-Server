package PoliceStationServer.services;


import PoliceStationServer.models.kidnapReport;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class kidnapReportService {
    @Autowired
    PoliceStationServer.repositories.kidnapReportRepository kidnapReportRepository;

    public List<kidnapReport> getAll() {
        System.out.println("service");
        return kidnapReportRepository.findAll();
    }

    public kidnapReport getById(Integer id) {
        return kidnapReportRepository.findByReport(id);
    }
}
