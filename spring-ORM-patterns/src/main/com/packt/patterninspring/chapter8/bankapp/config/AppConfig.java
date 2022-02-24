package main.com.packt.patterninspring.chapter8.bankapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@ComponentScan(basePackages={"main.com.packt.patterninspring.chapter8.bankapp"})
@Import({InfrastructureConfig.class})
public class AppConfig {
	
}
