package security.services;


import org.springframework.stereotype.Service;
import security.models.kidnapReport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class kidnapReportService {
    @Autowired
    security.repositories.kidnapReportRepository kidnapReportRepository;

    public List<kidnapReport> getAll() {
        return kidnapReportRepository.findAll();
    }

    public List<kidnapReport> getById(String id) {
        return kidnapReportRepository.findByReport(id);
    }
}
