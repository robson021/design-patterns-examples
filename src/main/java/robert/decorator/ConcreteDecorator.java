package robert.decorator;

public class ConcreteDecorator extends AbstractDecorator {

	protected ConcreteDecorator(Component component) {
		super(component);
	}

	public void componentAction() {
		super.component.componentAction();
		System.out.println("decorator action");
	}
}
