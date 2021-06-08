package PoliceStationServer.services;

import org.springframework.stereotype.Service;
import PoliceStationServer.models.report;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class reportService {
    @Autowired
    PoliceStationServer.repositories.reportRepository reportRepository;

    public List<report> getAll() {
        return reportRepository.findAll();
    }

}
