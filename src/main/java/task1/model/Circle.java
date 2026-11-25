package task1.model;

public class Circle extends Shape {

    private static final double EPSILON = 1e-9;
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("The radius value must be positive.");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return String.format("Circle: radius - %.2f, area - %.2f, perimeter - %.2f", radius, area(), perimeter());
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

        return Math.abs(this.area() - other.area()) < EPSILON;
    }
}
