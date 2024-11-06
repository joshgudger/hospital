package hospital.patients;

import hospital.staff.Doctor;
import hospital.treatments.Treatment;
import hospital.patients.MedicalRecord;
import hospital.staff.Person;


public class Patient extends Person {
    private String patientID;
    private MedicalRecord record;

    // Constructor
    public Patient(String name, int age, String gender, String patientID) {
        super(name, age, gender);
        this.patientID = patientID;
        this.record = new MedicalRecord();
    }

    // Get the medical history
    public MedicalRecord getMedicalHistory() {
        return record;
    }

    // Add a treatment to the patient's record
    public void addTreatment(Treatment treatment) {
        record.addTreatment(treatment);
    }
}
