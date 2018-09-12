package robert.tests;

import org.junit.Test;
import robert.chainofresponsibility.*;

public class ChainOfResponsibilityTest {

    @Test
    public void chainTest() {
        AbstractChief vegeChief = new VegeChief(null);
        AbstractChief pizzaChief = new PizzaChief(vegeChief);
        AbstractChief seafoodChief = new SeafoodChief(pizzaChief);

        seafoodChief.doTheJob(FoodType.VEGE);
        vegeChief.doTheJob(FoodType.PIZZA);
    }
}
