package hospital.staff;

import hospital.patients.Patient;

public class Nurse extends Person {
    private String department;

    // Constructor
    public Nurse(String name, int age, String gender, String department) {
        super(name, age, gender);
        this.department = department;
    }

    // Assist in patient care
    public void assistInCare(Patient patient) {
        System.out.println("Assisting in care for patient: " + patient.getDetails());
        // Additional care logic can be added here
    }
}
