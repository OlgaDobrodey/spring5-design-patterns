package main.com.packt.patterninspring.chapter10.bankapp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@ComponentScan(basePackages={"main.com.packt.patterninspring.chapter10.bankapp"})
@Import({InfrastructureConfig.class})
@EnableJpaRepositories(("main.com.packt.patterninspring.chapter10.bankapp.repository"))
public class AppConfig {
	
}
