package security.services;

import org.springframework.stereotype.Service;
import security.models.report;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class reportService {
    @Autowired
    security.repositories.reportRepository reportRepository;

    public List<report> getAll() {
        return reportRepository.findAll();
    }

}
