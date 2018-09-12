package robert.tests;

import org.junit.Assert;
import org.junit.Test;
import robert.builder.Product;

public class ProductBuilderTest {

    @Test
    public void builderTest() {
        Product product = Product.newBuilder()
                .withParam1(1)
                .withParam2(2)
                .build();

        Assert.assertEquals(1, product.getParam1());
        Assert.assertEquals(2, product.getParam2());
        Assert.assertEquals(-1, product.getParam3());
    }
}
