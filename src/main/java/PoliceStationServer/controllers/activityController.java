package PoliceStationServer.controllers;

import PoliceStationServer.models.activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class activityController {
    @Autowired
    PoliceStationServer.services.activityService activityService;

    @GetMapping("")
    public List<activity> getAll() {
        return activityService.getAll();
    }
}
