package robert.chainofresponsibility;

public class VegeChief extends AbstractChief {

	public VegeChief(AbstractChief nextChief) {
		super(nextChief, FoodType.VEGE);
	}

	@Override
	protected void cook(FoodType food) {
		System.out.println("im cooking vege food");
	}
}
