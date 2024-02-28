package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//Scope is singleton by default // Bean Scope
@Scope(scopeName = "prototype")
public class Sweeper implements Staff{

    private String qualification;

    @Override
    public boolean assist() {
        System.out.println("Sweeper is Cleaning");
        return false;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Sweeper{" +
                "qualification='" + qualification + '\'' +
                '}';
    }
}
