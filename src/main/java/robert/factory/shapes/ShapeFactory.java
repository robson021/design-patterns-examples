package robert.factory.shapes;

import robert.factory.Shape;
import robert.factory.ShapeType;

public abstract class ShapeFactory {

	public static Shape getShape(ShapeType shape) {
		switch (shape) {
			case CIRCLE:
				return new Circle();
			case SQUARE:
				return new Square();
			case RECTANGLE:
				return new Rectangle();
			case TRIANGLE:
				return new Triangle();
			default:
				return null;
		}
	}
}
