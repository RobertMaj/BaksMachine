package com.services;

import com.db.dao.UserRepository;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Robert on 2015-11-04.
 */
@Service
public class ServiceUser {


    @Autowired
    private UserRepository userRepository;

    public void addUser(User user) {
        userRepository.save(user);

    }

    public void deleteUser(User user) {

    }

    public void updateUser(User user) {

    }

}
