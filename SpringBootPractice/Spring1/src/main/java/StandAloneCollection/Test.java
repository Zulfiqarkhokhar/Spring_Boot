package StandAloneCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("SAConfig.xml");
        Person person = context.getBean("person", Person.class);

        System.out.println(person.getFriends());
        System.out.println("___________________________________________");
        System.out.println(person.getFeeStructure());
        System.out.println("___________________________________________");
        System.out.println(person.getProperties());
    }
}
