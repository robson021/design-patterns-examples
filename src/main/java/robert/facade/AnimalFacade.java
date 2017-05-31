package robert.facade;

public class AnimalFacade {

	private final Animal cat;

	private final Animal dog;

	private final Animal bird;

	public AnimalFacade() {
		this.cat = new Cat();
		this.dog = new Dog();
		this.bird = new Bird();
	}

	public void askCat() {
		cat.doSomething();
	}

	public void askDog() {
		dog.doSomething();
	}

	public void askBird() {
		bird.doSomething();
	}
}
