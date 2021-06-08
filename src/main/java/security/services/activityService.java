package security.services;

import org.springframework.stereotype.Service;
import security.models.activity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class activityService {
    @Autowired
    security.repositories.activityRepository activityRepository;

    public List<activity> getAll() {
        return activityRepository.findAll();
    }

}
