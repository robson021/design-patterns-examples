package robert.state;

public class StateTwo implements State {

    @Override
    public void goAction(Context context) {
        System.out.println("Object is in state two.");
        context.setState(new StateOne());
    }
}
