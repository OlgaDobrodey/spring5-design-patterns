package main.com.itrex.bankapp.config;

import main.com.itrex.springfactorybean.repository.AccountRepositoryFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import main.com.itrex.springfactorybean.service.TransferService;

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
