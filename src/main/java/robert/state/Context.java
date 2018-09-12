package robert.state;

public class Context {
    private State state = null;

    public Context() {
        this.state = new StateOne();
    }

    public void doAction() {
        this.state.goAction(this);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
