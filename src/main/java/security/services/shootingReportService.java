package security.services;


import org.springframework.stereotype.Service;
import security.models.shootingReport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class shootingReportService {
    @Autowired
    security.repositories.shootingReportRepository shootingReportRepository;

    public List<shootingReport> getAll() {
        return shootingReportRepository.findAll();
    }

}
