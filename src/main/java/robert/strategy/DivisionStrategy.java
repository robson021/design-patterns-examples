package robert.strategy;

public class DivisionStrategy implements Strategy {

	@Override
	public int doMath(int x, int y) {
		return x / y;
	}
}
