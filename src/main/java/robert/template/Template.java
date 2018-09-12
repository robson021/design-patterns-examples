package robert.template;

public abstract class Template {

    public void execute() {
        actionA();
        actionB();
    }

    abstract void actionA();

    abstract void actionB();
}
