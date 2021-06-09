package PoliceStationServer.services;

import PoliceStationServer.models.accidentReport;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class accidentReportService {
    @Autowired
    PoliceStationServer.repositories.accidentReportRepository accidentReportRepository;

    public List<accidentReport> getAll() {
        return accidentReportRepository.findAll();
    }

    public List<accidentReport> getById(Integer id) {
        return accidentReportRepository.findByReport(id);
    }
}
