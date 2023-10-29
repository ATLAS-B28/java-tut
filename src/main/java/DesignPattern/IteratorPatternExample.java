package DesignPattern;
import java.util.*;

//step 1 define the interface
interface Iterator<T>{
    boolean hasNext();
    T next();
}
//step 2 implement the concrete iterator class
class ListIterator<T> implements Iterator<T>{
    private final List<T> list;
    private int currentIndex;
    public ListIterator(List<T> list){
        this.list = list;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext(){
        return currentIndex < list.size();
    }
    @Override
    public T next(){
        if(hasNext()){
            T currentItem = list.get(currentIndex);
            currentIndex++;
            return currentItem;
        }
        throw new IndexOutOfBoundsException("no more elements");
    }
}
//step 3 define the aggregate
interface Aggregate<T>{
    Iterator<T> createIterator();
}

//step 4 define the concrete aggregate
class ListAggregate<T> implements Aggregate<T>{
    private final List<T> list;
    public  ListAggregate(){
        this.list = new ArrayList<>();
    }
    public void add(T item){
        list.add(item);
    }
    public void remove(T item){
        list.remove(item);
    }

    @Override
    public Iterator<T> createIterator(){
        return new ListIterator<>(list);
    }
}
//step 5 define the client
public class IteratorPatternExample{//<- behavioral pattern
    public static void main(String[] args){
        //create aggregate
        ListAggregate<String> aggregate = new ListAggregate<>();
        aggregate.add("Abhijeet");
        aggregate.add("Aditya");
        aggregate.add("Aajatshatru");
        aggregate.add("Amit");
        //create iterator
        Iterator<String> iterator = aggregate.createIterator();
        while(iterator.hasNext()){
            String item = iterator.next();
            System.out.println("Item: "+item);
        }
    }
}
