package robert.chainofresponsibility;

public class SeafoodChief extends AbstractChief {

    public SeafoodChief(AbstractChief nextChief) {
        super(nextChief, FoodType.SEAFOOD);
    }

    @Override
    protected void cook(FoodType food) {
        System.out.println("im making seafood");
    }
}
