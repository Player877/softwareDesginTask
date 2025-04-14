package course1.task2;

import course1.task2.shape.Circle;
import course1.task2.shape.Rectangle;
import course1.task2.shape.Shape;
import course1.task2.shape.Triangle;

public class ShapeFactory {
    public static Shape createShape(String shapeType) {
        return switch (shapeType) {
            case "Circle" -> new Circle();
            case "Rectangle" -> new Rectangle();
            case "Triangle" -> new Triangle();
            default -> null;
        };
    }
}
