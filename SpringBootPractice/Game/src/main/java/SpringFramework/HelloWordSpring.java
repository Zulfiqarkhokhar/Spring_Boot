package SpringFramework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWordSpring {
    public static void main(String[] args){

        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("person2"));
    }
}
