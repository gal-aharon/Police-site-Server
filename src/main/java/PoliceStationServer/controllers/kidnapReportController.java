package PoliceStationServer.controllers;


import PoliceStationServer.models.kidnapReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kidnap")
public class kidnapReportController {
    @Autowired
    PoliceStationServer.services.kidnapReportService kidnapReportService;

    @GetMapping("")
    public List<kidnapReport> getAll() {
        return kidnapReportService.getAll();
    }

    @GetMapping("id/{id}")
    public List<kidnapReport> getById(@PathVariable String id) {
        return kidnapReportService.getById(id);
    }
}
