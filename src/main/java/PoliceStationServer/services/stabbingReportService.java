package PoliceStationServer.services;


import PoliceStationServer.models.stabbingReport;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class stabbingReportService {
    @Autowired
    PoliceStationServer.repositories.stabbingReportRepository stabbingReportRepository;

    public List<stabbingReport> getAll() {
        return stabbingReportRepository.findAll();
    }

    public stabbingReport getById(Integer id) {
        return stabbingReportRepository.findByReport(id);
    }

    public void add(stabbingReport stabbingReport) {
        stabbingReportRepository.save(stabbingReport);
    }
}
