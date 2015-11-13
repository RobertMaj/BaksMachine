package com.app.mainConfig;

import config.DaoConfig;
import config.EntitiesConfig;
import config.ServicesConfig;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Robert on 2015-11-04.
 */
@Configuration
@Import({ServicesConfig.class, EntitiesConfig.class})
@ComponentScan("com")
@PropertySource("classpath:log4j")
public class AppConfig {

    public static final Logger logger = Logger.getLogger(AppConfig.class);


}
