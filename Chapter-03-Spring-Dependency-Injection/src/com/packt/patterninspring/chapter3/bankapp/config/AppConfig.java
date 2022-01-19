package com.packt.patterninspring.chapter3.bankapp.config;

import com.packt.patterninspring.chapter3.bankapp.repository.AccountRepository;
import com.packt.patterninspring.chapter3.bankapp.repository.TransferRepository;
import com.packt.patterninspring.chapter3.bankapp.repository.jdbc.JdbcAccountRepository;
import com.packt.patterninspring.chapter3.bankapp.repository.jdbc.JdbcTransferRepository;
import com.packt.patterninspring.chapter3.bankapp.service.TransferService;
import com.packt.patterninspring.chapter3.bankapp.service.TransferServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses={TransferService.class,AccountRepository.class})
public class AppConfig {
	
//	@Bean(name="service")
//	public TransferService transferService(){
//		return new TransferServiceImpl(accountRepository(), transferRepository());
//	}

	//best practices

	@Bean
	public AccountRepository accountRepository() {
		return new JdbcAccountRepository();
	}

	@Bean
	public TransferRepository transferRepository() {
		return new JdbcTransferRepository();
	}

//	@Bean(name = "service")
//	public TransferService transferService( AccountRepository accountRepository,TransferRepository transferRepository) {
//		return new TransferServiceImpl(accountRepository, transferRepository);
//	}

}
