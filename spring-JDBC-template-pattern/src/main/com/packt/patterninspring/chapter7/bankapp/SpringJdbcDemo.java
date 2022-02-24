package main.com.packt.patterninspring.chapter7.bankapp;

import main.com.packt.patterninspring.chapter7.bankapp.config.AppConfig;
import main.com.packt.patterninspring.chapter7.bankapp.service.AccountService;
import main.com.packt.patterninspring.chapter7.bankapp.service.TransferService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Dinesh.Rajput
 *
 */
public class SpringJdbcDemo {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

//		TransferService transferService = applicationContext.getBean(TransferService.class);
//		transferService.transfer(50000l, 1000l, 2000l);

		AccountService accountService = applicationContext.getBean(AccountService.class);
		accountService.aboutAccount(1000L);
		accountService.aboutAllAccounts();
		System.out.println("=============================================");
		accountService.findAccountByIdDifferent(1000L);
		applicationContext.close();

	}
}
