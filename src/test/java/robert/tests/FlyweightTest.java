package robert.tests;

import org.junit.Assert;
import org.junit.Test;
import robert.flyweight.ElementFactory;

public class FlyweightTest {

    @Test
    public void flyweightTest() throws Exception {
        final String[] names = {"one", "two", "three"};
        for (String name : names) {
            ElementFactory.getElement(name).printInfo();
            ElementFactory.getElement("other");
        }
        Assert.assertEquals(names.length + 1, ElementFactory.getElementsMapSize());
    }
}
