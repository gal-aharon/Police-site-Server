package security.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import security.models.activity;
import security.services.activityService;

import java.util.List;

@RestController
@RequestMapping("/activity")
public class activityController {
    @Autowired
    security.services.activityService activityService;

    @GetMapping("")
    public List<activity> getAll() {
        return activityService.getAll();
    }
}
