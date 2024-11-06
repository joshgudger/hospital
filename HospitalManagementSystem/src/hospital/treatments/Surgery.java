package hospital.treatments;

import hospital.patients.Patient;
import hospital.records.Treatable;

public class Surgery extends Treatment implements Treatable {
    private String surgeryType;
    private String surgeonName;

    // Constructor
    public Surgery(String description, double cost, String surgeryType, String surgeonName) {
        super(description, cost);
        this.surgeryType = surgeryType;
        this.surgeonName = surgeonName;
    }

    // Apply treatment (specific for Surgery)
    @Override
    public void applyTreatment(Patient patient) {
        System.out.println("Performing surgery: " + surgeryType + " on patient: " + patient.getDetails());
        patient.addTreatment(this);
    }
}
