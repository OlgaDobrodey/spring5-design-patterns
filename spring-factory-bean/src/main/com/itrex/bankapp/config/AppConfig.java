package main.com.itrex.bankapp.config;

import main.com.itrex.bankapp.repository.AccountRepositoryFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.com.itrex.bankapp.service.TransferService;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
public class AppConfig {
	@Bean
	public TransferService transferService() throws Exception{
		return new TransferService(accountRepository().getObject());
	}
	@Bean
	public AccountRepositoryFactoryBean accountRepository(){
		return new AccountRepositoryFactoryBean();
	}
}
