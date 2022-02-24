package com.packt.patterninspring.chapter5.bpp;

import com.packt.patterninspring.chapter5.bpp.service.MyService;
import com.packt.patterninspring.chapter5.bpp.service.TransferService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.packt.patterninspring.chapter5.bpp.config.AppConfig;

/**
 *
 */
public class BeanLifeCycleDemo {

	public static void main(String[] args) {
		//ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		System.out.println("===========================================================");
		TransferService transferService = applicationContext.getBean(TransferService.class);
		transferService.transfer("A", "B", 3000l);

		System.out.println("==========================PROTOTYPE=================================");
		MyService bean = applicationContext.getBean(MyService.class);


		System.out.println("===========================================================");

		System.out.println("=======================CLOSE APPLICATION=========================");

		//Destroy the application by closing application context
		applicationContext.close();
	}
}
