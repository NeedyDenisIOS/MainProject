package task1.model;

import java.security.spec.ECField;

public class Triangle extends Shape {

    private static final double EPSILON = 1E-9;

    private final double a;
    private final double b;
    private final double c;

    public Triangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("The value of the side must be positive.");
        }
        if (!isValid(a, b, c)) {
            throw new IllegalArgumentException("The triangle inequality is violated.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA()  {
        return a;
    }

    public double getB()  {
        return b;
    }

    public double getC()  {
        return c;
    }

    public boolean isValid(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }

    @Override
    public double area() {
        double semi_perimeter = (a + b + c)/2;
        double heron = (semi_perimeter * (semi_perimeter - a) * (semi_perimeter - b) * (semi_perimeter - c));
        return Math.sqrt(heron);
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }

    @Override
    public String toString() {
        return String.format("Triangle: a - %.2f, b - %.2f, c - %.2f, area - %.2f, perimeter - %.2f",
                a, b, c, area(), perimeter());
    }

    @Override
    public Triangle clone() {
        return new Triangle(this.a, this.b, this.c);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Triangle other = (Triangle) obj;

        return Math.abs(this.area() - other.area()) < EPSILON;
    }
}
