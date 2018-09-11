package robert.composite;

import org.junit.Test;

public class CompositeTest {

    @Test
    public void test() {
        Drawing drawing = new Drawing();
        Triangle triangle = new Triangle();
        drawing.addShape(triangle);
        drawing.addShape(new Square());
        drawing.addShape(new Rectangle());

        drawing.draw("red");
        drawing.draw("green");
        drawing.draw("blue");

        System.out.println("-----------------------");

        drawing.remove(triangle);
        drawing.draw("black");
    }

}