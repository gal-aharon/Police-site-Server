package security.services;


import org.springframework.stereotype.Service;
import security.models.user;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class userService {
    @Autowired
    security.repositories.userRepository userRepository;

    public List<user> getAll() {
        return userRepository.findAll();
    }

}
