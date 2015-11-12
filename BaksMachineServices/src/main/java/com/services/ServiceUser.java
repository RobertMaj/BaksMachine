package com.services;

import com.db.dao.DaoUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Robert on 2015-11-04.
 */
@Service("UserService")
public class ServiceUser {

    @Autowired
    private DaoUser daoUser;

    public void addUser() {

    }

    public void deleteUser() {

    }

    public void updateUser() {

    }

}
