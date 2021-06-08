package PoliceStationServer.controllers;


import PoliceStationServer.models.accidentReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/accident")
public class accidentReportController {
    @Autowired
    PoliceStationServer.services.accidentReportService accidentReportService;

    @GetMapping("")
    public List<accidentReport> getAll() {
        return accidentReportService.getAll();
    }

    @GetMapping("id/{id}")
    public List<accidentReport> getById(@PathVariable String id) {
        return accidentReportService.getById(id);
    }
}
