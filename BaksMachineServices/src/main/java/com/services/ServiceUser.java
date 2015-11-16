package com.services;

import com.db.dao.UserRepository;
import model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Robert on 2015-11-04.
 */
@Service
public class ServiceUser {

    private UserRepository userRepository;

    @Autowired
    public ServiceUser(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addUser(User user) {
        userRepository.save(user);

    }

    public void deleteUser(User user) {

    }

    public void updateUser(User user) {

    }

}
