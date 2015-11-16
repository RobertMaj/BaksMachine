package com.db.dao;

import model.User;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by Robert on 2015-11-04.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
