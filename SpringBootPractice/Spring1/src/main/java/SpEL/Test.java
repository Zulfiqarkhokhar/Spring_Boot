package SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("SpelConfig.xml");
        Practice p = context.getBean("practice", Practice.class);

        System.out.println(p);
        System.out.println(p.getName());
    }
}
