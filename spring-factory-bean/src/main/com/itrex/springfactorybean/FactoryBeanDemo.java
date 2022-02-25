package main.com.itrex.springfactorybean;

import main.com.itrex.springfactorybean.repository.AccountRepository;
import main.com.itrex.springfactorybean.repository.AccountRepositoryFactoryBean;
import main.com.itrex.springfactorybean.service.TransferService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBeanDemo {

	public static void main(String[] args) throws Exception {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		TransferService transferService = applicationContext.getBean(TransferService.class);
		transferService.transfer("A", "B", 3000.1);

		AccountRepositoryFactoryBean accountRepository = applicationContext.getBean(AccountRepositoryFactoryBean.class);
		System.out.println(accountRepository.getClass().getSimpleName());
		System.out.println(accountRepository.getObject());
		System.out.println(accountRepository.getObjectType());
		applicationContext.close();
	}

}
