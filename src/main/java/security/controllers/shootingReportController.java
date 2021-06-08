package security.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import security.models.shootingReport;
import security.services.shootingReportService;

import java.util.List;

@RestController
@RequestMapping("/shooting")
public class shootingReportController {
    @Autowired
    security.services.shootingReportService shootingReportService;

    @GetMapping("")
    public List<shootingReport> getAll() {
        return shootingReportService.getAll();
    }

    @GetMapping("id/{id}")
    public List<shootingReport> getById(@PathVariable String id) {
        return shootingReportService.getById(id);
    }
}
