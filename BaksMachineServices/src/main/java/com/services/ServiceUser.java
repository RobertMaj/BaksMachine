package com.services;

import com.db.dao.UserRepository;
import model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created by Robert on 2015-11-04.
 */
@Service
public class ServiceUser {

    @Autowired
    private UserRepository userRepository;

    public void insertUser(){
        User sUser = new User();
        sUser.setId(1);
        sUser.setName("Robert");
        sUser.setSurname("Maj");
        User u = userRepository.findUserByName("Maj");
    }


    public void addUser(User user) {
        userRepository.save(user);

    }

    public void deleteUser(User user) {

    }

    public void updateUser(User user) {

    }

}
