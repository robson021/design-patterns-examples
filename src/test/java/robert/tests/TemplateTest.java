package robert.tests;

import org.junit.Test;
import robert.template.Template;
import robert.template.TemplateImpl;

public class TemplateTest {

    @Test
    public void templateTest() {
        Template template = new TemplateImpl();
        template.execute();
    }
}
