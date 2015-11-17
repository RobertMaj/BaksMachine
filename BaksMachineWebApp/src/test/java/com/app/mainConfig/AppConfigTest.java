package com.app.mainConfig;

import com.db.dao.UserRepository;
import com.main.UserManagedBean;
import com.services.ServiceUser;
import config.DaoConfig;
import model.entities.User;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.jws.soap.SOAPBinding;

import static org.junit.Assert.*;

/**
 * Created by RobertM on 2015-11-12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppConfigTest {

    private static final Logger log = Logger.getLogger(AppConfigTest.class);

    @Autowired
    private ServiceUser serviceUser;

    @Test
    public void daoShouldNotNull(){
        User user = new User();
        user.setName("Robert");
        user.setSurname("Maj");
        serviceUser.addUser(user);
    }
}