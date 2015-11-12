package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by RobertM on 2015-11-12.
 */
@Configuration
@Import(DaoConfig.class)
@ComponentScan("com.services")
public class ServicesConfig {
}
