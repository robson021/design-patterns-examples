package robert.adapter.object;

public class Adaptor {

    private Adaptee adaptee;

    public void doSomething() {
        System.out.println("working");
        adaptee.doWork();
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
