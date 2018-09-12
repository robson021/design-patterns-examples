package robert.decorator;

public class ConcreteDecorator extends AbstractDecorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void componentAction() {
        System.out.println("decorator before action");
        super.decoratedComponent.componentAction();
        System.out.println("decorator after action");
    }
}
