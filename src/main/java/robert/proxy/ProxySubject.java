package robert.proxy;

public class ProxySubject implements Subject {

	private final String subjectName;

	private Subject subject;

	public ProxySubject(String subjectName) {
		this.subjectName = subjectName;
	}

	@Override
	public void request() {
		if (subject == null) {
			initNewSubject();
		}
		subject.request();
	}

	private synchronized void initNewSubject() {
		if (subject == null) {
			subject = new RealSubject(subjectName);
		}
	}
}
