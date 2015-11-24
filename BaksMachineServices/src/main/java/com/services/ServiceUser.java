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

    public void addUser(User user) {
        userRepository.saveAndFlush(user);

    }

    public void deleteUser(User user) {
        userRepository.delete(user);
    }

    public void updateUser(User user) {
        addUser(user);
    }

}
