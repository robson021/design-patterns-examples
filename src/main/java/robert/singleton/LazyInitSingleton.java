package robert.singleton;

public class LazyInitSingleton {

    private static LazyInitSingleton singleton = null;

    private LazyInitSingleton() {
    }

    public void doSomething() {
        System.out.println("i am lazy initialized singleton");
    }

    public static LazyInitSingleton getInstance() {
        if (singleton == null) {
            synchronized (LazyInitSingleton.class) {
                if (singleton == null) {
                    singleton = new LazyInitSingleton();
                }
            }
        }

        return singleton;
    }
}
