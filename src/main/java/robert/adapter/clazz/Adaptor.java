package robert.adapter.clazz;

import robert.adapter.clazz.iface.AdapteeA;
import robert.adapter.clazz.iface.AdapteeB;

public class Adaptor implements AdapteeA, AdapteeB {

    public void doSomething() {
        exampleMethodA();
        exampleMethodB();
    }

    public void exampleMethodA() {
        System.out.println("method A");
    }

    public void exampleMethodB() {
        System.out.println("method B");
    }
}
