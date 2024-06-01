package homwwork3.Problem5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String continueFlag = "y";

        do {
            String display= """
                    Enter C for Circle
                    Enter R for Rectangle
                    Enter T for Triangle
                    """;
            System.out.println(display);
            String figureType = scan.next();
            switch (figureType.toUpperCase()) {
                case "C":
                    System.out.println("Enter the radius of the circle:");
                    double circleRadius = scan.nextDouble();
                    Circle circle = new Circle(circleRadius);
                    System.out.printf("The area of the circle is: %.2f\n", circle.computeArea());
                    break;
                case "R":
                    System.out.println("Enter the width of the rectangle:");
                    double rectangleWidth = scan.nextDouble();
                    System.out.println("Enter the height of the rectangle:");
                    double rectangleHeight = scan.nextDouble();
                    Rectangle rectangle = new Rectangle(rectangleWidth, rectangleHeight);
                    System.out.printf("The area of the rectangle is: %.2f\n", rectangle.computeArea());
                    break;
                case "T":
                    System.out.println("Enter the base of the triangle:");
                    double triangleBase = scan.nextDouble();
                    System.out.println("Enter the height of the triangle:");
                    double triangleHeight = scan.nextDouble();
                    Triangle triangle = new Triangle(triangleBase, triangleHeight);
                    System.out.printf("The area of the triangle is: %.2f\n", triangle.computeArea());
                    break;
                default:
                    System.out.println("Invalid figure type!");
            }
            System.out.println("Do you want to continue? (y/n)");
            continueFlag = scan.next();
        } while (continueFlag.equalsIgnoreCase("y"));
    }

}

