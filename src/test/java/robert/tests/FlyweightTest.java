package robert.tests;

import org.junit.Assert;
import org.junit.Test;

import robert.flyweight.Element;
import robert.flyweight.ElementFactory;

public class FlyweightTest {

	@Test
	public void flyweightTest() throws Exception {
		final String[] names = { "one", "two", "three" };
		for (int i = 0; i < 3; i++) {
			for (String name : names) {
				Element element = ElementFactory.getElement(name);
				element.printInfo();
			}
		}
		Assert.assertEquals(names.length, ElementFactory.getElementsMapSize());
	}
}
