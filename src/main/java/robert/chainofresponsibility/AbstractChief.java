package robert.chainofresponsibility;

public abstract class AbstractChief {

	protected final AbstractChief nextChief;

	private final FoodType myFoodSpecialization;

	public AbstractChief(AbstractChief nextChief, FoodType myFoodSpecialization) {
		this.nextChief = nextChief;
		this.myFoodSpecialization = myFoodSpecialization;
	}

	public void doTheJob(FoodType food) {
		if ( food.equals(this.myFoodSpecialization) ) {
			cook(food);
		} else if ( this.nextChief != null ) {
			nextChief.doTheJob(food);
		} else {
			System.out.println("end of chain");
		}
	}

	protected abstract void cook(FoodType food);
}
