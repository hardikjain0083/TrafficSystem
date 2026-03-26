// NormalStrategy.java
class NormalStrategy implements ControlStrategy {
    public int calculateGreenTime(Road road) {
        return 10 + road.calculateDensity() * 2;
    }
}