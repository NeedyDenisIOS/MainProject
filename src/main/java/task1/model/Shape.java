package task1.model;

public abstract class Shape implements Cloneable {

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object obj);

    @Override
    public abstract Shape clone();

}
