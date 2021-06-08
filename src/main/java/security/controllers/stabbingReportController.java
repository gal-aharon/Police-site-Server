package security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import security.models.stabbingReport;
import security.services.stabbingReportService;

import java.util.List;

@RestController
@RequestMapping("/stabbing")
public class stabbingReportController {
    @Autowired
    security.services.stabbingReportService stabbingReportService;

    @GetMapping("")
    public List<stabbingReport> getAll() {
        return stabbingReportService.getAll();
    }
}
