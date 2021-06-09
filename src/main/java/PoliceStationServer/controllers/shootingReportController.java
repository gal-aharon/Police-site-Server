package PoliceStationServer.controllers;


import PoliceStationServer.models.shootingReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/shooting")
public class shootingReportController {
    @Autowired
    PoliceStationServer.services.shootingReportService shootingReportService;

    @GetMapping("")
    public List<shootingReport> getAll() {
        return shootingReportService.getAll();
    }

    @GetMapping("id/{id}")
    public shootingReport getById(@PathVariable String id) {
        return shootingReportService.getById(id);
    }
}
