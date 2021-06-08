package PoliceStationServer.controllers;

import PoliceStationServer.models.report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/report")
public class reportController {
    @Autowired
    PoliceStationServer.services.reportService reportService;

    @GetMapping("")
    public List<report> getAll() {
        return reportService.getAll();
    }
}
