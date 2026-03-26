// HeavyTrafficStrategy.java
class HeavyTrafficStrategy implements ControlStrategy {
    public int computeGreenTime(double density) {
        return (int)(20 + density * 3);
    }
}