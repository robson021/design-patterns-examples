package robert.observer;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ThreadLocalRandom;

public class Topic implements Subject {

    private static final List<String> messages = Arrays.asList("hi", "hello", "greetings", "how are you?");

    private final Set<Observer> observes = new CopyOnWriteArraySet<>();

    @Override
    public void register(Observer observer) {
        observes.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observes.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observes.iterator().forEachRemaining(Observer::update);
    }

    @Override
    public Object getUpdate(Observer observer) {
        int i = ThreadLocalRandom.current().nextInt(0, messages.size());
        return messages.get(i);
    }
}
