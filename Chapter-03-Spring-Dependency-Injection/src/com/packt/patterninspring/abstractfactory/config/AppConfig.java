package com.packt.patterninspring.abstractfactory.config;

import com.packt.patterninspring.abstractfactory.service.TransferServiceImpl;
import com.packt.patterninspring.abstractfactory.repository.AccountRepositoryFactoryBean;
import com.packt.patterninspring.abstractfactory.service.TransferService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.packt.patterninspring.abstractfactory")
public class AppConfig {

	@Bean
	public TransferService transferService() throws Exception{
		return new TransferServiceImpl(accountRepository().getObject());
	}
	@Bean
	public AccountRepositoryFactoryBean accountRepository(){
		return new AccountRepositoryFactoryBean();
	}
}
