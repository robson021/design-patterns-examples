package robert.factory.shapes;

import robert.factory.Shape;

class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("im a Circle");
    }
}
