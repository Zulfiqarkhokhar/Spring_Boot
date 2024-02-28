package SpringFramework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person (String name, int age){

}
@Configuration
public class HelloWorldConfiguration {
    @Bean
    public String name(){
        return "Zulfiqar Ali";
    }
    @Bean
    public Person person(){
        return new Person("Yasir",23);
    }

    @Bean
    public int age(){
        return 16;
    }

    @Bean
    public Person person2(){
        return new Person(name(),age());
    }
}
