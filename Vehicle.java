// Vehicle.java
abstract class Vehicle {
    protected String vehicleId;
    protected double weightage;
    protected double length;
    protected double speedFactor;

    Vehicle(String vehicleId, double weightage, double length, double speedFactor) {
        this.vehicleId = vehicleId;
        this.weightage = weightage;
        this.length = length;
        this.speedFactor = speedFactor;
    }

    // Abstract method
    abstract double getEffectiveWeight();

    // Clearing time logic
    public double getClearingTime() {
        return length / speedFactor;
    }
}