package robert.builder;

public class Product {

    private final int param1;

    private final int param2;

    private final int param3;

    private Product(ProductBuilder productBuilder) {
        this.param1 = productBuilder.param1;
        this.param2 = productBuilder.param2;
        this.param3 = productBuilder.param3;
    }

    public int getParam1() {
        return param1;
    }

    public int getParam2() {
        return param2;
    }

    public int getParam3() {
        return param3;
    }

    public static class ProductBuilder {
        private int param1 = -1;

        private int param2 = -1;

        private int param3 = -1;

        public Product build() {
            return new Product(this);
        }

        public ProductBuilder withParam1(int param1) {
            this.param1 = param1;
            return this;
        }

        public ProductBuilder withParam2(int param2) {
            this.param2 = param2;
            return this;
        }

        public ProductBuilder withParam3(int param3) {
            this.param3 = param3;
            return this;
        }
    }

    public static ProductBuilder newBuilder() {
        return new ProductBuilder();
    }
}
