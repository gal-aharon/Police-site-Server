package PoliceStationServer.controllers;

import PoliceStationServer.models.GeneralReport;
import PoliceStationServer.models.report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/report")
public class reportController {
    @Autowired
    PoliceStationServer.services.reportService reportService;

    @GetMapping("")
    public List<report> getAll() {
        return reportService.getAll();
    }

    @PostMapping("/add")
    @ResponseBody
    public void addActivity(@RequestBody GeneralReport newReport) {

        reportService.add(newReport);
    }
}
