package StereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("StereoConfig.xml");
        Student student1 = context.getBean("student", Student.class);
        System.out.println(student1);
        System.out.println(student1.getNumbers());

        Student student2 = context.getBean("student", Student.class);
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());

    }
}
