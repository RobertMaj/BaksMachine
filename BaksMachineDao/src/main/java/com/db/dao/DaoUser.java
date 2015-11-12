package com.db.dao;

import model.User;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Repository;

/**
 * Created by Robert on 2015-11-04.
 */
@Repository
public class DaoUser {

    public User getUserById() {
        return new User();
    }
}
