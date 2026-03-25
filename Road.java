// Road.java
import java.util.*;

class Road {
    String name;
    List<Vehicle> vehicles;

    Road(String name) {
        this.name = name;
        this.vehicles = new ArrayList<>();
    }

    void addVehicle(Vehicle v) {
        vehicles.add(v);
    }

    int getVehicleCount() {
        return vehicles.size();
    }
    int calculateDensity() {
    int density = 0;
    for (Vehicle v : vehicles) {
        density += v.weight;
    }
    return density;
}
}

