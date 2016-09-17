package com.tutorialspoint;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.BeansException;
public class InitProcessor implements BeanPostProcessor {
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException{
		System.out.println("Before initialization "+beanName+" "+bean.getClass());
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean, String beanName){
		System.out.println("After initialization "+beanName+" "+bean.getClass());
		return bean;
	}
}
