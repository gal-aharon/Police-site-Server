package PoliceStationServer.services;

import PoliceStationServer.models.activity;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class activityService {
    @Autowired
    PoliceStationServer.repositories.activityRepository activityRepository;

    public List<activity> getAll() {
        return activityRepository.findAll();
    }

    public void add(activity activity) {
        activityRepository.save(activity);
    }

}
