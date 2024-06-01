package homework3.problem5;

public final class Circle {
    private final double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}
