package homework3.problem5;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            input();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void input() {
        inputLoop:
        while (true) {
            System.out.println("""
                    Enter C for Circle
                    Enter R for Rectangle
                    Enter T for Triangle
                    """);
            switch (scanner.next()) {
                case "C":
                    handleCircle();
                    confirmRepeatInput();
                    break inputLoop;
                case "R":
                    handleRectangle();
                    confirmRepeatInput();
                    break inputLoop;
                case "T":
                    handleTriangle();
                    confirmRepeatInput();
                    break inputLoop;
                default:
                    System.out.println("Invalid input");
            }

        }
    }

    private static void confirmRepeatInput() {
        repeatLoop:
        while (true) {
            System.out.println("Do you want to continue(y/n)");
            String answer = scanner.next();
            switch (answer) {
                case "y":
                    input();
                    break repeatLoop;
                case "n":
                    break repeatLoop;
                default:
                    System.out.println("Invalid confirmation input");
            }
        }
    }

    private static void handleRectangle() {
        System.out.println("Enter the width of the Rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter the height of the Rectangle: ");
        double height = scanner.nextDouble();
        System.out.printf("The area of Rectangle is: %.2f \n", new Rectangle(width, height).getArea());
    }

    private static void handleCircle() {
        System.out.println("Enter the radius of the Circle: ");
        double radius = scanner.nextDouble();
        System.out.printf("The area of Circle is: %.2f \n", new Circle(radius).getArea());
    }

    private static void handleTriangle() {
        System.out.println("Enter the base of the Triangle: ");
        double base = scanner.nextDouble();
        System.out.println("Enter the height of the Triangle: ");
        double height = scanner.nextDouble();
        System.out.printf("The area of Triangle is: %.2f \n", new Triangle(base, height).getArea());
    }
}

