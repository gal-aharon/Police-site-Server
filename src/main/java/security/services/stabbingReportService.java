package security.services;


import org.springframework.stereotype.Service;
import security.models.stabbingReport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class stabbingReportService {
    @Autowired
    security.repositories.stabbingReportRepository stabbingReportRepository;

    public List<stabbingReport> getAll() {
        return stabbingReportRepository.findAll();
    }

}
