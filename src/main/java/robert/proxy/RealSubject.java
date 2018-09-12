package robert.proxy;

public class RealSubject implements Subject {

    private final String name;

    public RealSubject(String name) {
        this.name = name;
        System.out.println("new subject init");
    }

    @Override
    public void request() {
        System.out.println("access to object: " + RealSubject.class.getName() + " with name: " + name);
    }
}
