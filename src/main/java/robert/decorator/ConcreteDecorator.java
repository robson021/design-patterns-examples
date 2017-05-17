package robert.decorator;

public class ConcreteDecorator extends AbstractDecorator {

	public ConcreteDecorator(Component component) {
		super(component);
	}

	@Override
	public void componentAction() {
		super.decoratedComponent.componentAction();
		System.out.println("decorator action");
	}
}
