package robert.strategy;

public class MultiplicationStrategy implements Strategy {

	@Override
	public int doMath(int x, int y) {
		return x * y;
	}
}
