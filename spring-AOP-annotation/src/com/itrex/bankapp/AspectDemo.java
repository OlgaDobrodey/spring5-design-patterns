package com.itrex.bankapp;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.itrex.bankapp.config.AppConfig;
import com.itrex.bankapp.service.TransferService;

public class AspectDemo {

	public static void main(String[] args) throws InterruptedException {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		TransferService transferService = applicationContext.getBean(TransferService.class);
		transferService.transfer("accountA", "accountB", 50000l);

		transferService.createCache("Let's go");

		applicationContext.close();
	}

}
