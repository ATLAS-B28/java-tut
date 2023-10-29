package DesignPattern;

//step 1 define product class
class Product1{
    private String prop1;
    private String prop2;
    private String prop3;

    public void setProp1(String prop1){
        this.prop1 = prop1;
    }
    public void setProp2(String prop2){
        this.prop2 = prop2;
    }
    public void setProp3(String prop3){
        this.prop3 = prop3;
    }
    public String getProp1(){
        return prop1;
    }
    public String getProp2(){
        return prop2;
    }
    public String getProp3(){
        return prop3;
    }
}

//step 2 create builder class
class ProductBuilder{
    private final Product1 product;

    public ProductBuilder(){
        this.product = new Product1();
    }
    public ProductBuilder withProp1(String prop1){
        product.setProp1(prop1);
        return this;
    }
    public ProductBuilder withProp2(String prop2){
        product.setProp2(prop2);
        return this;
    }
    public ProductBuilder withProp3(String prop3){
        product.setProp3(prop3);
        return this;
    }
    public Product1 build(){
        return product;
    }
}
public class BuilderPattern {
    public static void main(String[] args) {//<- creational pattern
        //create builder object
        ProductBuilder builder = new ProductBuilder();
        //use it to construct the product
        Product1 product1 = builder
                .withProp1("prop1 value")
                .withProp2("prop2 value")
                .withProp3("prop3 value")
                .build();

        System.out.println(product1.getProp1());
        System.out.println(product1.getProp2());
        System.out.println(product1.getProp3());
    }
}
