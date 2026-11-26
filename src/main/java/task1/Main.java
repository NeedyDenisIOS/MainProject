package task1;

import task1.model.Circle;
import task1.model.Rectangle;
import task1.model.Shape;
import task1.model.Triangle;
import javax.xml.transform.Source;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(3.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);

        System.out.println("All the figures: ");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        System.out.println("\nComparison of objects\n");

        Shape c1 = new Circle(5.0);
        Shape c2 = new Circle(5);

        Shape r1 = new Rectangle(4, 6);
        Shape r2 = new Rectangle(12, 2);

        Shape t1 = new Triangle(3, 4, 5);
        Shape t2 = new Triangle(4, 5, 6);

        System.out.println("c1 VS c2: " + c1.equals(c2));
        System.out.println("r1 VS r2: " + r1.equals(r2));
        System.out.println("t1 VS t2: " + t1.equals(t2));

        System.out.println("\nCloning:");

        Circle newCircle = new Circle(5);
        Circle cloneCircle = newCircle.clone();

        System.out.println("NewCircle and cloneCircle: " + (newCircle == cloneCircle));

        System.out.println("equals circles: " + (newCircle.equals(cloneCircle)));
    }
}