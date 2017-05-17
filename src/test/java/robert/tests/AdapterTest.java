package robert.tests;

import org.junit.Test;

import robert.adapter.object.Adaptee;
import robert.adapter.object.Adaptor;

public class AdapterTest {

    @Test
    public void objectAdapterTest() {
        Adaptor adaptor = new Adaptor();
        adaptor.setAdaptee(new Adaptee());

        adaptor.doSomething();
    }

    @Test
    public void classAdapterTest() {
        robert.adapter.clazz.Adaptor adaptor = new robert.adapter.clazz.Adaptor();
        adaptor.doSomething();
    }

}
