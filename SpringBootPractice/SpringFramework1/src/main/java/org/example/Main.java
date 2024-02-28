package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        //System.out.println("Hello world!");

       // ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaBeanConfig.class);
        Sweeper staff = context.getBean(Sweeper.class);
        staff.assist();
       staff.setQualification("SSC");
        System.out.println(staff.toString());
        Sweeper staff1 = context.getBean(Sweeper.class);
        staff.assist();
        //staff.setQualification("SSC");
        System.out.println(staff1.toString());
//        System.out.println(staff.getQualification());
//        System.out.println(staff.getNurse().assist());

    }
}