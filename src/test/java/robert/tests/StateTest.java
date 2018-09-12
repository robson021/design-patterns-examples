package robert.tests;

import org.junit.Test;
import robert.state.Context;

public class StateTest {

    @Test
    public void stateTest() {
        Context context = new Context();
        for (int i = 0; i < 5; i++) {
            context.doAction();
        }
    }
}
