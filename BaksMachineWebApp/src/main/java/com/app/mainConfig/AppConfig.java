package com.app.mainConfig;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

/**
 * Created by Robert on 2015-11-04.
 */
@Configuration
public class AppConfig {

    @Bean
    DataSource dataSource(Environment env) {
        HikariConfig dataSourceConfig = new HikariConfig();
        dataSourceConfig.setDriverClassName(env.getRequiredProperty("baks.db.driver"));
        dataSourceConfig.setJdbcUrl(env.getRequiredProperty("baks.db.url"));
        dataSourceConfig.setUsername(env.getRequiredProperty("baks.db.user"));
        dataSourceConfig.setPassword(env.getRequiredProperty("baks.db.pass"));
        return new HikariDataSource(dataSourceConfig);
    }

}
