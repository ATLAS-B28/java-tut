package DesignPattern;

 class Singleton{//<- creational pattern
     //private constructor
    private Singleton(){

    }

     private static final class InstanceHolder{
        private static final Singleton instance = new Singleton();
     }

     //public static getInstance method
    public static Singleton getInstance(){
        return InstanceHolder.instance;
    }
    //other methods of Singleton class
    public void doSomething(){
        System.out.println("Singleton Pattern doing something");
    }
}
public class SingletonPattern{
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        singleton.doSomething();
    }
}
