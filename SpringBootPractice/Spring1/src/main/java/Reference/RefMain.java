package Reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("ReferenceConfig.xml");
        A ref = (A) context.getBean("aref");

        System.out.println(ref.getX());
        System.out.println(ref.getOb().getY());
    }
}
