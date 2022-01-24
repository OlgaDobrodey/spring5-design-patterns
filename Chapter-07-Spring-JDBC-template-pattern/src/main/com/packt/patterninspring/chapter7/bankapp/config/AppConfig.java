package main.com.packt.patterninspring.chapter7.bankapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Dinesh.Rajput
 */
@Configuration
@ComponentScan(basePackages = {"main.com.packt.patterninspring.chapter7.bankapp"})
//implicity bean creation
@Import({InfrastructureConfig.class, SecurityConfig.class})
public class AppConfig {


}
