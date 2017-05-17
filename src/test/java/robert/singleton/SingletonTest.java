package robert.singleton;

import org.junit.Test;

public class SingletonTest {

    @Test
    public void doSomething() throws Exception {

        Singleton.getInstance()
                .doSomething();

        LazyInitSingleton.getInstance()
                .doSomething();
    }

}