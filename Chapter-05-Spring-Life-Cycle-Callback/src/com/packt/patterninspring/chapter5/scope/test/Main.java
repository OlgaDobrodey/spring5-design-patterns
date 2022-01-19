package com.packt.patterninspring.chapter5.scope.test;

import com.packt.patterninspring.chapter5.scope.config.Config;
import com.packt.patterninspring.chapter5.scope.bean.MyBean;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Dinesh.Rajput
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {
//		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        MyBean myBean = applicationContext.getBean(MyBean.class);
        System.out.println(myBean.getName());
        BeanDefinition bean = applicationContext.getBeanDefinition("myBean");
        System.out.println("Scope= "+bean.getScope());
        System.out.println("All registered Scopes are : ");
        for (String scope : applicationContext.getBeanFactory().getRegisteredScopeNames()) {
            System.out.println(scope);
        }
        applicationContext.close();
    }

}
