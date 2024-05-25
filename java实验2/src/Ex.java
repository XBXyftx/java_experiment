import java.util.Scanner;

public class Ex {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            double a = input.nextDouble();

            double b = input.nextDouble();

            double c = input.nextDouble();

            double d = input.nextDouble();

            double e = input.nextDouble();

            double f = input.nextDouble();

            Figure g[] = { new Rectangle(a, b), new Circle(c), new Circle(d), new Rectangle(e, f) };

            System.out.println("the total area is " + sum(g));
        }

    }

    static double sum(Figure[] g) {
        double sum = 0;
        for (int i = 0; i < g.length; i++) {
            sum += g[i].getArea();
        }
        return sum;
    }

}

abstract class Figure {
    public abstract double getArea();
}

class Rectangle extends Figure {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Circle extends Figure {
    double radius;
    final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}