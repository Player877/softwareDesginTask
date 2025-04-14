package course1.task2;

import course1.task2.shape.Shape;

import java.util.List;

public class Client {
    private List<Shape> shapes;

    public void initShape(){
        shapes.add(ShapeFactory.createShape("Circle"));
        shapes.add(ShapeFactory.createShape("Rectangle"));
        shapes.add(ShapeFactory.createShape("Triangle"));
    }
}
