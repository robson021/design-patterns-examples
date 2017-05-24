package robert.state;

public class StateOne implements State {

	@Override
	public void goAction(Context context) {
		System.out.println("Object is in state one.");
		context.setState(new StateTwo());
	}
}
