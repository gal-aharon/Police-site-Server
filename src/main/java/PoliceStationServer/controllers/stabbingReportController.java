package PoliceStationServer.controllers;

import PoliceStationServer.models.stabbingReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/stabbing")
public class stabbingReportController {
    @Autowired
    PoliceStationServer.services.stabbingReportService stabbingReportService;

    @GetMapping("")
    public List<stabbingReport> getAll() {
        return stabbingReportService.getAll();
    }

    @GetMapping("id/{id}")
    public List<stabbingReport> getById(@PathVariable String id) {
        return stabbingReportService.getById(id);
    }
}
