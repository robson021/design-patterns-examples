package robert.adapter.clazz;

import robert.adapter.clazz.iface.AdapteeA;
import robert.adapter.clazz.iface.AdapteeB;

public class Adaptor implements AdapteeA, AdapteeB {

    public void doSomething() {
        System.out.println("Adaptor is working now...");
        exampleMethodA();
        exampleMethodB();
    }

    @Override
    public void exampleMethodA() {
        System.out.println("method A");
    }

    @Override
    public void exampleMethodB() {
        System.out.println("method B");
    }
}
