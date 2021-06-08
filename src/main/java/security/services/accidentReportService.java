package security.services;

import org.springframework.stereotype.Service;
import security.models.accidentReport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class accidentReportService {
    @Autowired
    security.repositories.accidentReportRepository accidentReportRepository;

    public List<accidentReport> getAll() {
        return accidentReportRepository.findAll();
    }

    public List<accidentReport> getById(String id) {
        return accidentReportRepository.findByReport(id);
    }
}
