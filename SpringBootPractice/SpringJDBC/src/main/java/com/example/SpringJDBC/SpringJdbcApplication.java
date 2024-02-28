package com.example.SpringJDBC;

import StudentDao.StudentDao;
import StudentEntities.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		System.out.println("Hello");

		//this there is jdbcconfig.xml file
		//ApplicationContext context = new ClassPathXmlApplicationContext("jdbcConfig.xml");


		ApplicationContext context = new AnnotationConfigApplicationContext(JDBCconfig.class);
		StudentDao dao = context.getBean("dao",StudentDao.class);

//		Student student = new Student();
//		student.setId(333);
//		student.setName("Ameer Ali");
//		student.setCity("Ghotki");
//		int result = dao.insert(student);
 //		System.out.println("Number of Record inserted"+result);

//		Student student = new Student();
//
//		student.setId(123);
//		student.setName("Zeeshan Abbassi");
//		student.setCity("Larkana");
//		int result = dao.change(student);
//		System.out.println("Record Updated"+result);

//		int result = dao.delete(123);
//		System.out.println("Record deleted"+result);

//		Student student = new Student();
//		student = dao.getStudent(111);
//		System.out.println(student);

		List<Student> students = dao.getAllStudent();
		for(Student s:students){
			System.out.println(s);
		}

	}

}
