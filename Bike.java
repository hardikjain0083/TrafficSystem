// Bike.java
class Bike extends Vehicle {

    Bike(String id) {
        super(id, 1.0, 2.0, 1.2);
    }

    @Override
    double getEffectiveWeight() {
        return weightage * speedFactor;
    }
}