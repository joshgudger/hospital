package hospital.patients;

import hospital.treatments.Treatment;
import java.util.ArrayList;
import java.util.List;

public class MedicalRecord {
    private List<Treatment> treatments;
    private String notes;

    // Constructor
    public MedicalRecord() {
        this.treatments = new ArrayList<>();
        this.notes = "";
    }

    // Add a treatment to the record
    public void addTreatment(Treatment treatment) {
        treatments.add(treatment);
    }

    // Retrieve treatment history
    public List<Treatment> getHistory() {
        return treatments;
    }

    // Add notes to the record
    public void addNotes(String note) {
        this.notes += note + "\n";
    }
}
