package org.example;

public class Doctor implements Staff{

    private String qualification;
    private Nurse nurse;

    public Doctor(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public boolean assist() {
        System.out.println("Doctor is Assisting");
        return false;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                ", nurse=" + nurse +
                '}';
    }
}
