package robert.decorator;

public abstract class AbstractDecorator implements Component {

	protected final Component component;

	protected AbstractDecorator(Component component) {
		this.component = component;
	}
}
