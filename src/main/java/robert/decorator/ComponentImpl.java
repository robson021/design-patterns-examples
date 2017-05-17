package robert.decorator;

public class ComponentImpl implements Component {

	@Override
	public void componentAction() {
		System.out.println("decoratedComponent impl action!");
	}
}
