package robert.strategy;

public class SumStrategy implements Strategy {

	@Override
	public int doMath(int x, int y) {
		return x + y;
	}
}
