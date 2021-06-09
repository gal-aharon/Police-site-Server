package PoliceStationServer.services;

import PoliceStationServer.models.userActivity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userActivityService {
    @Autowired
    PoliceStationServer.repositories.userActivityRepository userActivityRepository;

    public void add(userActivity activity) {
        userActivityRepository.save(activity);
    }
}
