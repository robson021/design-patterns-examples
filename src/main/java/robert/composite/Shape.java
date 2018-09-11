package robert.composite;

public interface Shape {
    default void draw(String color) {
        System.out.println("Drawing " + color + " " + getClass().getSimpleName());
    }
}
