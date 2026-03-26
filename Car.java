// Car.java
class Car extends Vehicle {

    Car(String id) {
        super(id, 2.0, 4.5, 1.0);
    }

    @Override
    double getEffectiveWeight() {
        return weightage * speedFactor;
    }
}