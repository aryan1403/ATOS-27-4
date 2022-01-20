package com.example.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class SpringdemoApplication {
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("Beans.xml");
		BeanFactory context = new XmlBeanFactory(resource);
		meow m = (meow) context.getBean("meow");

		m.saymeow();
	}
}
