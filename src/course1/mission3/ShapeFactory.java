package course1.mission3;

public class ShapeFactory {
    public static Shape createShape(String shapeType) throws UnsupportedShapeException {
        return switch (shapeType) {
            case "circle" -> new Circle();
            case "rectangle" -> new Rectangle();
            case "triangle" -> new Triangle();
            default -> throw new UnsupportedShapeException("illegal shape");
        };
    }
}
