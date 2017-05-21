package robert.tests;

import org.junit.Test;
import robert.proxy.ProxySubject;

public class ProxyTest {

	@Test
	public void proxyTest() {
		ProxySubject proxy = new ProxySubject("example");
		proxy.request();
		proxy.request();
		proxy.request();
	}
}
