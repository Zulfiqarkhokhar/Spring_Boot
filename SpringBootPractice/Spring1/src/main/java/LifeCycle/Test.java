package LifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("LifeCycleConfig.xml");

        Samosa s1 = (Samosa) context.getBean("s1");

        System.out.println(s1);
        context.registerShutdownHook();

        Pepsi p1 = (Pepsi) context.getBean("p1");
        System.out.println(p1);


        Course course = (Course) context.getBean("course");
        System.out.println(course);
    }
}
