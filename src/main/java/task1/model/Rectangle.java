package task1.model;

import utils.Validator;

public class Rectangle extends Shape{

    private static final double EPSILON = 1e-9;

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        Validator.requirePositive(width, "width", this);
        Validator.requirePositive(height, "height", this);
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
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return String.format("Rectangle: width - %.2f, height - %.2f, getArea - %.2f, getPerimeter - %.2f",
                width, height, getArea(), getPerimeter());
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

        return Math.abs(this.getArea() - other.getArea()) < EPSILON;
    }
}
