import java.util.Scanner;

public class TestGeometricObject {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Rectangle rect = new Rectangle(sc.nextDouble(), sc.nextDouble());
            Circle circle = new Circle(sc.nextDouble());
            System.out.println(rect.toString());
            System.out.println(circle.toString());
        }
    }

}

interface GeometricObject {
    public double getArea();

    public double getPerimeter();
}

class Circle implements GeometricObject {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "图形的周长" + getPerimeter() + "\n图形的面积" + getArea();
    }
}

class Rectangle implements GeometricObject {
    private double length;
    private double width;

    public Rectangle() {

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "图形的周长" + getPerimeter() + "\n图形的面积" + getArea();
    }

}
