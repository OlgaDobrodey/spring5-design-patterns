package com.packt.patterninspring.chapter5.bpp.config;

import com.packt.patterninspring.chapter5.bpp.repository.AccountRepository;
import com.packt.patterninspring.chapter5.bpp.repository.JdbcAccountRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@ComponentScan("com.packt.patterninspring.chapter5.bpp")
public class AppConfig {
	@Bean
//			(initMethod = "populateCache")
//			(destroyMethod = "clearCache")
	public AccountRepository accountRepository(){
		return new JdbcAccountRepository();
	}
}
