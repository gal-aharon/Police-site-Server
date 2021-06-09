package PoliceStationServer.controllers;


import PoliceStationServer.models.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/users")
public class userController {
    @Autowired
    PoliceStationServer.services.userService userService;

    @GetMapping("")
    public List<user> getAll() {
        return userService.getAll();
    }

    @PatchMapping("/loc/{x}/{y}")
    @ResponseBody
    public void changeLoc(@RequestBody user user, @PathVariable Double x, @PathVariable Double y) {
        userService.changeLoc(user, x, y);
    }
}
