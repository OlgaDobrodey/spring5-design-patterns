package main.com.packt.patterninspring.chapter8.bankapp;

import main.com.packt.patterninspring.chapter8.bankapp.dao.AccountDao;
import main.com.packt.patterninspring.chapter8.bankapp.dao.AccountDaoImpl;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import main.com.packt.patterninspring.chapter8.bankapp.config.AppConfig;
import main.com.packt.patterninspring.chapter8.bankapp.service.TransferService;

/**
 * @author Dinesh.Rajput
 *
 */
public class SpringORMDemo {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		TransferService transferService = applicationContext.getBean(TransferService.class);
		transferService.transfer(50000l, 1000l, 2000l);
		System.out.println("==================================================");

		AccountDao accountDao = applicationContext.getBean(AccountDao.class);
		System.out.println(accountDao.totalAccountsByBranch("Dinesh"));
		System.out.println(accountDao.findAccountById(2000));
		System.out.println(accountDao.findByName("Dinesh"));
		System.out.println(accountDao.findOne(3000l));
		applicationContext.close();
	}

}
