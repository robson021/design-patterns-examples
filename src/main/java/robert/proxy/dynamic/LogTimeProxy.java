package robert.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LogTimeProxy implements InvocationHandler {

    private final Object target;

    public LogTimeProxy(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long t0 = System.nanoTime();
        Object result = method.invoke(target, args);
        long t1 = System.nanoTime();

        System.out.println("Elapsed time: " + (t1 - t0) + " nanos, invoked method: " + method.getName());
        return result;
    }
}
