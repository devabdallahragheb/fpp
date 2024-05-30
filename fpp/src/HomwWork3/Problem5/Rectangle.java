package HomwWork3.Problem5;

public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double computeArea() {
        return width * height;
    }

}
