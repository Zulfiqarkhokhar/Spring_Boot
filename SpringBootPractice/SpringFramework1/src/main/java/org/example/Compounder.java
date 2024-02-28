package org.example;

import org.springframework.stereotype.Component;

@Component
public class Compounder implements Staff{


    @Override
    public boolean assist() {
        System.out.println("Compounder is Assisting");
        return false;
    }
}
