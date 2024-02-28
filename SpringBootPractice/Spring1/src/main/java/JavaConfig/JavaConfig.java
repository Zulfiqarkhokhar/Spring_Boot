package JavaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "JavaConfig")
public class JavaConfig {
    @Bean
    public Samosa setSamosa(){
        return new Samosa();
    }
    @Bean(name = {"std1","std2"})
    public Student setStudent(){
        Student student = new Student(setSamosa());
        return student;
    }
}
