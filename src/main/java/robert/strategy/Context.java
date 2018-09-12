package robert.strategy;

public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int x, int y) {
        return strategy.doMath(x, y);
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
