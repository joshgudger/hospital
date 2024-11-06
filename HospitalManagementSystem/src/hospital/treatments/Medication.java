package hospital.treatments;

import hospital.patients.Patient;
import hospital.records.Treatable;

public class Medication extends Treatment implements Treatable {
    private String medicationName;
    private String dosage;

    // Constructor
    public Medication(String description, double cost, String medicationName, String dosage) {
        super(description, cost);
        this.medicationName = medicationName;
        this.dosage = dosage;
    }

    // Apply treatment (specific for Medication)
    @Override
    public void applyTreatment(Patient patient) {
        System.out.println("Administering medication: " + medicationName + " to patient: " + patient.getDetails());
        patient.addTreatment(this);
    }
}
