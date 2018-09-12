package robert.composite;

import java.util.HashSet;
import java.util.Set;

public class Drawing implements Shape {

    private final Set<Shape> shapes = new HashSet<>();

    void addShape(Shape shape) {
        shapes.add(shape);
    }

    @Override
    public void draw(final String color) {
        for (Shape shape : shapes)
            shape.draw(color);
    }

    public boolean remove(Shape shape) {
        return shapes.remove(shape);
    }
}
