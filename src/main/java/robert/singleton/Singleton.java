package robert.singleton;

public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton() {
    }

    public void doSomething() {
        System.out.println("i am singleton");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
