package com.db.dao;

import model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Robert on 2015-11-04.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
