package PoliceStationServer.controllers;

import PoliceStationServer.models.activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/activity")
public class activityController {
    @Autowired
    PoliceStationServer.services.activityService activityService;

    @GetMapping("")
    public List<activity> getAll() {
        return activityService.getAll();
    }

    @PostMapping("/add")
    @ResponseBody
    public void addActivity(@RequestBody activity act) {
        System.out.println("test: " + act);
        activityService.add(act);
    }

}
