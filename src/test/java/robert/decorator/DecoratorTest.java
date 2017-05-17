package robert.decorator;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void decoratorTest() {
		AbstractDecorator decorator = new ConcreteDecorator(new ComponentImpl());
		decorator.componentAction();
	}

}