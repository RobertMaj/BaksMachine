package com.app.mainConfig;

import com.services.ServiceUser;
import config.DaoConfig;
import org.apache.log4j.Logger;
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

    private static final Logger log = Logger.getLogger(AppConfigTest.class);

    @Autowired
    private DaoConfig daoConfig;



    @Test
    public void daoShouldNotNull(){
        assertNotNull(daoConfig.getEnv());
    }
}