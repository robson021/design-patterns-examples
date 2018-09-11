package robert.flyweight;

public class ElementImpl implements Element {

    private final String name;

    public ElementImpl(String name) {
        this.name = name;
    }

    @Override
    public void printInfo() {
        System.out.println("this is " + getClass() + " " + name);
    }
}
