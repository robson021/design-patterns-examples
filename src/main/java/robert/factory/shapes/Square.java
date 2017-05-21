package robert.factory.shapes;

import robert.factory.Shape;

class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("im a Square");
	}
}
