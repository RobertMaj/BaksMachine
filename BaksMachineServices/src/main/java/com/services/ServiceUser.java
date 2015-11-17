package com.services;

import com.db.dao.UserRepository;
import model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

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

    }


    public void addUser(User user) {
        List<User> u = userRepository.findUserByName("Maj");

    }

    public void deleteUser(User user) {

    }

    public void updateUser(User user) {

    }

}
