package PoliceStationServer.controllers;


import PoliceStationServer.models.kidnapReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/kidnap")
public class kidnapReportController {
    @Autowired
    PoliceStationServer.services.kidnapReportService kidnapReportService;

    @GetMapping("")
    public List<kidnapReport> getAll() {
        System.out.println("controller");
        return kidnapReportService.getAll();
    }

    @GetMapping("id/{id}")
    public kidnapReport getById(@PathVariable Integer id) {
        return kidnapReportService.getById(id);
    }
}
