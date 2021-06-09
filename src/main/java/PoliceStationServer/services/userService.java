package PoliceStationServer.services;


import PoliceStationServer.models.user;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class userService {
    @Autowired
    PoliceStationServer.repositories.userRepository userRepository;

    public List<user> getAll() {
        return userRepository.findAll();
    }

    public void changeLoc(user user, double x, double y) {
        user.setCur_locx(x);
        user.setCur_locy(y);
        userRepository.save(user);
    }

}
