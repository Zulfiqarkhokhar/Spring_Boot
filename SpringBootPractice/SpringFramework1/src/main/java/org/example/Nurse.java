package org.example;

public class Nurse implements Staff{
    @Override
    public boolean assist() {
        System.out.println("Nurse is Assisting");
        return false;
    }
}
