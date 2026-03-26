// Road.java
import java.util.*;

class Road {
    private String name;
    private List<Vehicle> vehicles;

    Road(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    public double calculateDensity() {
        double density = 0;
        for (Vehicle v : vehicles) {
            density += v.getEffectiveWeight();
        }
        return density;
    }

    public String getName() {
        return name;
    }
}