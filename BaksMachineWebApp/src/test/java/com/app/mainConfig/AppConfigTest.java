package com.app.mainConfig;

import com.services.ServiceUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by RobertM on 2015-11-12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class)
public class AppConfigTest {

    @Autowired
    private ServiceUser serviceUser;

    @Test
    public void daoShouldNotNull(){
        assertNotNull(serviceUser.getDaoUser());
    }
}