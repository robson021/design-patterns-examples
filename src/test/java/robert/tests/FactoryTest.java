package robert.tests;

import org.junit.Test;
import robert.factory.Shape;
import robert.factory.ShapeType;
import robert.factory.shapes.ShapeFactory;

public class FactoryTest {

	@Test
	public void factoryTest() {
		for (ShapeType shapeType : ShapeType.values()) {
			Shape shape = ShapeFactory.getShape(shapeType);
			shape.draw();
		}
	}
}
