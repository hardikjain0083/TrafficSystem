// NormalStrategy.java
class NormalStrategy implements ControlStrategy {
    public int computeGreenTime(double density) {
        return (int)(10 + density * 2);
    }
}