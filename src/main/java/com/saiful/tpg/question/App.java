package com.saiful.tpg.question;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.saiful.tpg.question.no3.CustomerService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/applicationContext.xml");
		CustomerService customerService = (CustomerService) context.getBean("customerService");
		customerService.execute();

	}
}
