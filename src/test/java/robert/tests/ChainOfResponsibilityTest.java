package robert.tests;

import org.junit.Test;

import robert.chainofresponsibility.AbstractChief;
import robert.chainofresponsibility.FoodType;
import robert.chainofresponsibility.PizzaChief;
import robert.chainofresponsibility.SeafoodChief;
import robert.chainofresponsibility.VegeChief;

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
