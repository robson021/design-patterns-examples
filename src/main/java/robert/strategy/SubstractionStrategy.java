package robert.strategy;

public class SubstractionStrategy implements Strategy {

	@Override
	public int doMath(int x, int y) {
		return x - y;
	}
}
