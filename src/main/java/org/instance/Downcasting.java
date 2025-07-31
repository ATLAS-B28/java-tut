package org.instance;
//upcasted
class Animal1 {
    void eat () {
        System.out.println("Animal is eating");
    }
}

class Cat extends Animal1 {
    void meow() {
        System.out.println("Meow");
    }
}

//downcast
class Animal2 {
    void eat() {
        System.out.println("Animal2 is eating");
    }
}

class Cat1 extends Animal2 {
    void meow() {
        System.out.println("Meow1");
    }
}
public class Downcasting {
    public static void main(String[] args){
        //upcasting
        Cat cat = new Cat();
        cat.eat();//accessing the eat() method of Animal
        cat.meow();//accessing the meow() method of Cat
        Animal1 animal = cat;//now upcasting - where cat is upcasted to Animal
        animal.eat();//accessing the eat() method of Animal
        //animal.meow(); -> error as animal is not of type Cat

        //downcasting

        Animal2 animal2 = new Cat1();
        animal2.eat();//accessing the eat() method of Animal
        Cat1 cat2 = (Cat1) animal2;//downcasting
        cat2.meow();//accessing the meow() method of Cat

       // Animal2 animal1 = new Animal2();
        //animal1.eat();//accessing the eat() method of Animal
        //Cat1 cat1 = (Cat1) animal1;//gives ClassCastException
        //cat1.meow();
    }
}