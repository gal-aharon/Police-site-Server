package PoliceStationServer.controllers;


import PoliceStationServer.models.accidentReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/accident")
public class accidentReportController {
    @Autowired
    PoliceStationServer.services.accidentReportService accidentReportService;

    @GetMapping("")
    public List<accidentReport> getAll() {
        return accidentReportService.getAll();
    }

    @GetMapping("id/{id}")
    public accidentReport getById(@PathVariable Integer id) {
        return accidentReportService.getById(id);
    }
}
