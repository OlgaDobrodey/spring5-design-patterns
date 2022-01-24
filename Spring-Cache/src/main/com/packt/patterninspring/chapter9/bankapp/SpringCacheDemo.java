package main.com.packt.patterninspring.chapter9.bankapp;

import main.com.packt.patterninspring.chapter9.bankapp.config.AppConfig;
import main.com.packt.patterninspring.chapter9.bankapp.model.Account;
import main.com.packt.patterninspring.chapter9.bankapp.service.AccountService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Dinesh.Rajput
 *
 */
public class SpringCacheDemo {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		AccountService transferService = applicationContext.getBean(AccountService.class);
		Account account = transferService.findOne(1l);
		System.out.println(account);
		Account account2 = transferService.findOne(1l);
		System.out.println(account2);
		applicationContext.close();
	}
	
}
