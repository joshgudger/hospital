package hospital.staff;

import hospital.patients.Patient;
import hospital.treatments.Treatment;
import hospital.records.Diagnosable;
import hospital.records.Treatable;
import java.util.ArrayList;
import java.util.List;

public class Doctor extends Person implements Diagnosable, Treatable {
    private String specialization;
    private List<Patient> patients;

    // Constructor
    public Doctor(String name, int age, String gender, String specialization) {
        super(name, age, gender);
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Diagnose a condition
    @Override
    public void diagnoseCondition(Patient patient) {
        System.out.println("Diagnosing patient: " + patient.getDetails());
        // Diagnostic logic can be added here
    }

    // Apply treatment to a patient
    @Override
public void applyTreatment(Patient patient) {
    System.out.println("Applying treatment to patient: " + patient.getDetails());
    //patient.addTreatment(treatment);  // Assuming addTreatment is defined in Patient to handle Treatment objects
}

    

    // Add a patient to the doctor's list
    public void addPatient(Patient patient) {
        patients.add(patient);
    }
}
