package LifeCycle;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Course {
    private String name;

    public Course(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                '}';
    }
    @PostConstruct
    public void study(){
        System.out.println("studying C++");
    }
    @PreDestroy
    public void withdraw(){
        System.out.println("Withdrawing C++");
    }
}
