package robert.tests;

import org.junit.Test;
import robert.decorator.AbstractDecorator;
import robert.decorator.ComponentImpl;
import robert.decorator.ConcreteDecorator;

public class DecoratorTest {

    @Test
    public void decoratorTest() {
        AbstractDecorator decorator = new ConcreteDecorator(new ComponentImpl());
        decorator.componentAction();
    }

}