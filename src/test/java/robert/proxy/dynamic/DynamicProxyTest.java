package robert.proxy.dynamic;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Proxy;
import java.time.LocalDateTime;

public class DynamicProxyTest {

    @Test
    public void invokeDynamicProxy() {
        DateTimeService target = new DateTimeServiceOne();
        DateTimeService proxy = getLogTimeProxyForDateTimeService(target);
        LocalDateTime localDateTime = proxy.getCurrentDateAndTime();
        assertResult(localDateTime);

        DateTimeService target2 = new DateTimeServiceTwo();
        DateTimeService proxy2 = getLogTimeProxyForDateTimeService(target2);
        LocalDateTime localDateTime2 = proxy2.getCurrentDateAndTime();
        assertResult(localDateTime2);
    }

    private <T extends DateTimeService> DateTimeService getLogTimeProxyForDateTimeService(T target) {
        Class<?> clazz = target.getClass();
        return (DateTimeService) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), new LogTimeProxy(target));
    }

    private void assertResult(LocalDateTime localDateTime) {
        Assert.assertNotNull(localDateTime);
        System.out.println("Proxy result: " + localDateTime);
    }

}