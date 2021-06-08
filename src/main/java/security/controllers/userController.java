package security.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import security.models.user;
import security.services.userService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class userController {
    @Autowired
    security.services.userService userService;

    @GetMapping("")
    public List<user> getAll() {
        return userService.getAll();
    }
}
