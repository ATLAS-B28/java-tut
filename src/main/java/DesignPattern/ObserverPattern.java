package DesignPattern;
import java.util.*;

interface Observer{//<- behavioral pattern
    void update(int state);
}
interface Subject{
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

class ConcreteSubject implements Subject{
    private final List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(state);
        }
    }
}

class ConcreteObserver implements Observer{
    private final String name;

    public ConcreteObserver(String name){
        this.name = name;
    }

    @Override
    public void update(int state){
        System.out.println(name + " received update. New state: " + state);
    }
}
public class ObserverPattern{
    public static void main(String[] args){
        //create the subject
        ConcreteSubject sub = new ConcreteSubject();
        //create observers
        Observer obs1 = new ConcreteObserver(" Observer 1");
        Observer obs2 = new ConcreteObserver(" Observer 2");
        //register observers with subject
        sub.registerObserver(obs1);
        sub.registerObserver(obs2);
        //set the state of the subject
        sub.setState(9);
        //remove observer
        sub.removeObserver(obs1);
        //set state of subject again
        sub.setState(10);
    }
}
