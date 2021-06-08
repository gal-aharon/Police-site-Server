package security.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import security.models.kidnapReport;
import security.services.kidnapReportService;

import java.util.List;

@RestController
@RequestMapping("/kidnap")
public class kidnapReportController {
    @Autowired
    security.services.kidnapReportService kidnapReportService;

    @GetMapping("")
    public List<kidnapReport> getAll() {
        return kidnapReportService.getAll();
    }
}
