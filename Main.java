// Main.java
public class Main {
    public static void main(String[] args) {
        Road roadA = new Road("A");
        roadA.addVehicle(new Vehicle("Car", 1));
        roadA.addVehicle(new Vehicle("Truck", 2));

        System.out.println("Vehicles on Road A: " + roadA.getVehicleCount());
    }
}