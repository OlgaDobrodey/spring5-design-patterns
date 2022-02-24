package com.itrex.patterninspring.chapter3.bankapp;

import com.itrex.patterninspring.chapter3.bankapp.config.AppConfig;
import com.itrex.patterninspring.chapter3.bankapp.model.Amount;
import com.itrex.patterninspring.chapter3.bankapp.service.TransferService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransferMain {

	public static void main(String[] args) {
		//Load Spring context
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		//Get TransferService bean
		TransferService transferService = applicationContext.getBean(TransferService.class);
		//Use transfer method
		transferService.transferAmmount(100l, 200l, new Amount(2000.0));

		//TransferService service = (TransferService) applicationContext.getBean("service");
	//	service.transferAmmount(100l, 200l, new Amount(2000.0));

		applicationContext.close();

	}

}
