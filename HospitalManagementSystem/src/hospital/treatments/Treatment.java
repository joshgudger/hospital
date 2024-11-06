package hospital.treatments;

import hospital.patients.Patient;

public abstract class Treatment {
    protected String description;
    protected double cost;

    // Constructor
    public Treatment(String description, double cost) {
        this.description = description;
        this.cost = cost;
    }

    // Abstract method to apply treatment
    public abstract void applyTreatment(Patient patient);


 // Getter for description
 public String getDescription() {
    return description;
}

// Getter for cost
public double getCost() {
    return cost;
}







}
