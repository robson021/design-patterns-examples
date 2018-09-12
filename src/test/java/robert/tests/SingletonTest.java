package robert.tests;

import org.junit.Test;
import robert.singleton.LazyInitSingleton;
import robert.singleton.Singleton;

public class SingletonTest {

    @Test
    public void doSomething() throws Exception {

        Singleton.getInstance()
                .doSomething();

        LazyInitSingleton.getInstance()
                .doSomething();
    }

}