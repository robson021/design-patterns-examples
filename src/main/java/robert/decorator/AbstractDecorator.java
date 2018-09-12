package robert.decorator;

public abstract class AbstractDecorator implements Component {

    protected final Component decoratedComponent;

    protected AbstractDecorator(Component decoratedComponent) {
        this.decoratedComponent = decoratedComponent;
    }
}
