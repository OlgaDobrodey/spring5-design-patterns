package com.packt.patterninspring.chapter5.bpp.bpp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author Dinesh.Rajput
 *As you can see in the preceding output, a string of both the callback methods
 * is printed for each bean method in the Spring container. Spring provides
 * many pre-implemented BeanPostProcessor for some specific features, as
 * follows:
 * RequiredAnnotationBeanPostProcessor
 * AutowiredAnnotationBeanPostProcessor
 * CommonAnnotationBeanPostProcessor
 * PersistenceAnnotationBeanPostProcessor
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In After bean Initialization method. Bean name is "+beanName);
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("In Before bean Initialization method. Bean name is "+beanName);
		return bean;
	}

}
