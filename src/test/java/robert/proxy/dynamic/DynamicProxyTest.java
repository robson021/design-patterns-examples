package robert.proxy.dynamic;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Proxy;
import java.time.LocalDateTime;

public class DynamicProxyTest {

    @Test
    public void invokeDynamicProxy() {
        DateTimeService target = new DateTimeServiceImpl();
        Class<? extends DateTimeService> clazz = target.getClass();
        DateTimeService proxy = (DateTimeService) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new LogTimeProxy(target));

        LocalDateTime localDateTime = proxy.getCurrentDateAndTime();

        Assert.assertNotNull(localDateTime);
        System.out.println("Proxy result: " + localDateTime);
    }

}