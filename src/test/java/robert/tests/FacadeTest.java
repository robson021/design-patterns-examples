package robert.tests;

import org.junit.Test;
import robert.facade.AnimalFacade;

public class FacadeTest {

    @Test
    public void facadeTest() {
        AnimalFacade facade = new AnimalFacade();
        facade.askBird();
        facade.askCat();
        facade.askDog();
    }

}
