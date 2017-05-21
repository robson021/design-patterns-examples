package robert.factory.shapes;

import robert.factory.Shape;

class Triangle implements Shape {
	@Override
	public void draw() {
		System.out.println("im a Triangle");
	}
}
