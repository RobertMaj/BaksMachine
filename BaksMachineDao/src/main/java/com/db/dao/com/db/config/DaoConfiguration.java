package com.db.dao.com.db.config;

import com.db.dao.DaoUser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Robert on 2015-11-12.
 */
@Configuration
public class DaoConfiguration {

    @Bean
    public DaoUser daoUser() {
        return new DaoUser();
    }
}
