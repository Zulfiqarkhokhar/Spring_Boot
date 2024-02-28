package JavaConfig;

import org.springframework.stereotype.Component;

//@Component("student")
public class Student {

    private Samosa samosa;

    public Student(Samosa samosa) {
        this.samosa = samosa;
    }

    public void study(){
        this.samosa.price();
        System.out.println("Student is Studying");
    }
}
