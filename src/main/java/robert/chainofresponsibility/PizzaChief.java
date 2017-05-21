package robert.chainofresponsibility;

public class PizzaChief extends AbstractChief {

	public PizzaChief(AbstractChief nextChief) {
		super(nextChief, FoodType.PIZZA);
	}

	@Override
	protected void cook(FoodType food) {
		System.out.println("im making pizza");
	}
}
