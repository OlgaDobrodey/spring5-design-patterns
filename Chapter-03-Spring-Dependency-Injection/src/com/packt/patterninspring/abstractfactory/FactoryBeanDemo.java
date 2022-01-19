package com.packt.patterninspring.abstractfactory;

import com.packt.patterninspring.abstractfactory.config.AppConfig;
import com.packt.patterninspring.abstractfactory.service.TransferService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryBeanDemo {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        TransferService transferService = applicationContext.getBean(TransferService.class);
        transferService.transfer("A", "B", 3000.1);
        applicationContext.close();
    }

}
