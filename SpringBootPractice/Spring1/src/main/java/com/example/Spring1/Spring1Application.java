package com.example.Spring1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Spring1Application {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Student std1 = (Student) context.getBean("student1");
		System.out.println(std1);
		Student std2 = (Student) context.getBean("student2");
		System.out.println(std2);
		Student std3 = (Student) context.getBean("student3");
		System.out.println(std3);


	}

}
