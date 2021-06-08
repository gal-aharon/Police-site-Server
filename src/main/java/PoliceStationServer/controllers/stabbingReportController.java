package PoliceStationServer.controllers;

import PoliceStationServer.models.stabbingReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
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
