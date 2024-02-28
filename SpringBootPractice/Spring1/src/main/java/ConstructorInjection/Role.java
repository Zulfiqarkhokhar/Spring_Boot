package ConstructorInjection;

public class Role {
    String role;

    public Role(String role){
        this.role = role;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role='" + role + '\'' +
                '}';
    }
}
