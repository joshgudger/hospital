import hospital.patients.Patient;
import hospital.staff.Doctor;
import hospital.staff.Nurse;
import hospital.treatments.Medication;
import hospital.treatments.Surgery;

public class TestHospitalSystem {
    public static void main(String[] args) {
        // Create a patient
        Patient patient = new Patient("John Doe", 30, "Male", "P001");

        // Create a doctor
        Doctor doctor = new Doctor("Dr. Smith", 45, "Female", "Cardiologist");

        // Doctor diagnoses the patient
        doctor.diagnoseCondition(patient);

        // Create treatments
        Medication medication = new Medication("Heart Medication", 150.0, "Aspirin", "100mg");
        Surgery surgery = new Surgery("Heart Surgery", 5000.0, "Bypass", "Dr. Smith");

        // Apply treatments
        doctor.applyTreatment(patient);
        patient.addTreatment(medication);
        patient.addTreatment(surgery);

        // Create a nurse
        Nurse nurse = new Nurse("Nurse Joy", 28, "Female", "Cardiology");

        // Nurse assists with patient care
        nurse.assistInCare(patient);

        // Print patient medical history
System.out.println("Medical History for " + patient.getDetails());
patient.getMedicalHistory().getHistory().forEach(treatment -> 
    System.out.println(" - Treatment: " + treatment.getDescription() + ", Cost: $" + treatment.getCost())
);

    }
}



