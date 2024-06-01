package homework3.problem5;

public final class Triangle {
    private final double base;
    private final double height;
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getArea() {
        return base * height / 2;
    }
}
