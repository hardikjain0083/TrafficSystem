// Truck.java
class Truck extends Vehicle {

    Truck(String id) {
        super(id, 3.0, 10.0, 0.6);
    }

    @Override
    double getEffectiveWeight() {
        return weightage * speedFactor;
    }
}