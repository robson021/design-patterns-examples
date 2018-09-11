package robert.observer;

import java.util.logging.Logger;

public class Subscriber implements Observer {

    private final String name;

    private Subject subject;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        Object update = subject.getUpdate(this);
        Logger.getAnonymousLogger().info(() -> name + " received: " + update.toString());
    }

    @Override
    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
