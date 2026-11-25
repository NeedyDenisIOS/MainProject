package task1.model;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape{

    private static final double EPSILON = 1e-9;

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0) {
            throw new IllegalArgumentException("The value of the sides must be positive.");
        }
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format("Rectangle: width - %.2f, height - %.2f, area - %.2f, perimeter - %.2f",
                width, height, area(), perimeter());
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.width, this.height);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Rectangle other = (Rectangle) obj;

        return Math.abs(this.area() - other.area()) < EPSILON;
    }
}
