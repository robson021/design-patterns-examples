package robert.tests;

import org.junit.Test;

import robert.proxy.ProxySubject;
import robert.proxy.Subject;

public class ProxyTest {

	@Test
	public void proxyTest() {
		Subject proxy = new ProxySubject("example");
		proxy.request();
		proxy.request();
		proxy.request();
	}
}
