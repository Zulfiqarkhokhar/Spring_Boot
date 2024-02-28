package ConstructorInjection;

public class Person {
    private String name;
    private int Id;
    private Role role;

    public Person(String name, int Id, Role role){
        this.name = name;
        this.Id = Id;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", Id=" + Id +
                ", role=" + role +
                '}';
    }
}
