package org.abstraction;

abstract class Implement2 implements Interface2 {
    public void a2(){
        System.out.println("a2");//using abstract class to create default
        //implementation of interface for the 'a2' method
    }

}
class Implement3 extends Implement2{
    public void a2(){
        System.out.println("a2 again");
    }
    public void b2 (){
       System.out.println("b2");
    }
    public void c2 (){
        System.out.println("c2");
    }
}
public class Implement{
    public static void main(String[] args){
        Interface2 obj = new Implement3();//interface implementation by a proper class
        Implement2 obj2 = new Implement2() {//interface implementation by an abstract class
            @Override
            public void b2() {
                System.out.println("b2");
            }

            @Override
            public void c2() {
                System.out.println("c2");
            }
        };
        Implement3 obj3 = new Implement3();
        obj.a2();
        obj.b2();
        obj.c2();
        obj2.a2();
        obj2.b2();
        obj2.c2();
        obj3.a2();
        obj3.b2();
        obj3.c2();
    }
}
