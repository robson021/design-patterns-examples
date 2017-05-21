package robert.tests;

import org.junit.Assert;
import org.junit.Test;

import robert.strategy.Context;
import robert.strategy.DivisionStrategy;
import robert.strategy.MultiplicationStrategy;
import robert.strategy.SubstractionStrategy;
import robert.strategy.SumStrategy;

public class StrategyTest {

	@Test
	public void strategyTest() {
		final int x = 8, y = 5;

		Context context = new Context(new SumStrategy());
		int result = context.executeStrategy(x, y);

		Assert.assertEquals(x + y, result);

		context.setStrategy(new SubstractionStrategy());
		result = context.executeStrategy(x, y);
		Assert.assertEquals(x - y, result);

		context.setStrategy(new MultiplicationStrategy());
		result = context.executeStrategy(x, y);
		Assert.assertEquals(x * y, result);

		context.setStrategy(new DivisionStrategy());
		result = context.executeStrategy(x, y);
		Assert.assertEquals(x / y, result);
	}
}
