package DesignPattern;

//step 1 define the interface for product
interface Product{
    void doSomething();
}
//step 2 implement the product class
class ConcreteProductA implements Product{
    @Override
    public void doSomething(){
        System.out.println("ConcreteProductA doing something");
    }
}

class ConcreteProductB implements Product{
    @Override
    public void doSomething(){
        System.out.println("ConcreteProductB doing something");
    }
}

//step 3 define the factory for creating product subclasses with specific implementation
interface Factory{
    Product createProduct();
}
//step 4 implement the factory class
class ConcreteFactoryA implements Factory{
    @Override
    public Product createProduct(){
        return new ConcreteProductA();
    }
}

class ConcreteFactoryB implements Factory{
    @Override
    public Product createProduct(){
        return new ConcreteProductB();
    }
}

public class FactoryPattern{
    public static void main(String[] args){//<- creational pattern
        Factory factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        product.doSomething();

        factory = new ConcreteFactoryB();
        product = factory.createProduct();
        product.doSomething();
    }
}
