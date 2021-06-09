package PoliceStationServer.controllers;

import PoliceStationServer.models.activity;
import PoliceStationServer.models.user;
import PoliceStationServer.models.userActivity;
import PoliceStationServer.services.userActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/activity")
public class activityController {
    @Autowired
    PoliceStationServer.services.activityService activityService;
    userActivityService userActivityService;

    @GetMapping("")
    public List<activity> getAll() {
        return activityService.getAll();
    }

    @PostMapping("/add")
    @ResponseBody
    public void addActivity(@RequestBody activity act) {
        userActivity temp;
        activityService.add(act);
        for(user user: act.getPo_list()) {
            temp = new userActivity(act.getAct_id(), user.getUser_id());
            userActivityService.add(temp);
        }
    }

}
