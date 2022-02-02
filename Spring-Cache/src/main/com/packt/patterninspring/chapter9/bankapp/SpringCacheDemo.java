package main.com.packt.patterninspring.chapter9.bankapp;

import main.com.packt.patterninspring.chapter9.bankapp.config.AppConfig;
import main.com.packt.patterninspring.chapter9.bankapp.model.Account;
import main.com.packt.patterninspring.chapter9.bankapp.service.AccountService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Dinesh.Rajput
 */
public class SpringCacheDemo {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
//		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService transferService = applicationContext.getBean(AccountService.class);
        Account account = new Account(1000l,40000l,"Lena");
//
		Account account1 = transferService.findOne(1000l);
//		System.out.println(transferService.findOne(1l));
//		System.out.println(transferService.findOne(1l));

        System.out.println("====================================");
        System.out.println(transferService.save(account));

        System.out.println(transferService.findOne(1000l));
        transferService.remove(1000l);

        transferService.findOne(1000l);

        applicationContext.close();
    }

}
