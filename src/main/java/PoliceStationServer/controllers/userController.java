package PoliceStationServer.controllers;


import PoliceStationServer.models.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
