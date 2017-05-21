package robert.factory.shapes;

import robert.factory.Shape;

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("im a Rectangle");
	}
}
