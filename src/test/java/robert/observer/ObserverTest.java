package robert.observer;

import org.junit.Test;

public class ObserverTest {

    @Test
    public void test() {
        Topic topic = new Topic();
        Subscriber one = new Subscriber("one");
        Subscriber two = new Subscriber("two");
        Subscriber three = new Subscriber("three");

        one.setSubject(topic);
        two.setSubject(topic);
        three.setSubject(topic);

        topic.register(one);
        topic.register(two);
        topic.register(three);

        topic.notifyObservers();
        topic.unregister(three);
        topic.notifyObservers();
    }

}