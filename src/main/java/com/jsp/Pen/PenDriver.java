package com.jsp.Pen;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class PenDriver {

	public static void main(String[] args) {
		ClassPathResource classPathResource=new ClassPathResource("myspring.xml");
		
		//Call Bean Factory
		
		BeanFactory beanFactory=new XmlBeanFactory(classPathResource);
		Pen p=(Pen) beanFactory.getBean("mypen");
		p.write();
		
		
		
	}
}
