package task1.model;

import utils.Validator;

public class Circle extends Shape {

    private static final double EPSILON = 1e-9;
    private final double radius;

    public Circle(double radius) {
        Validator.requirePositive(radius, "radius", this);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle: radius - %.2f, getArea - %.2f, getPerimeter - %.2f", radius, getArea(), getPerimeter());
    }

    @Override
    public Circle clone() {
        return new Circle(this.radius);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Circle other = (Circle) obj;

        return Math.abs(this.getArea() - other.getArea()) < EPSILON;
    }
}
