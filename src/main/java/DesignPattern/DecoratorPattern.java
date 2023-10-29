package DesignPattern;
//component interface
interface Coffee{
    String getDescription();
    double getCost();
}
//concrete component
class SimpleCoffee implements Coffee{
    @Override
    public String getDescription(){
        return "Simple Coffee";
    }
    @Override
    public double getCost(){
        return 5.0;
    }
}
//Decorator class
abstract class CoffeeDecorator implements Coffee{
    protected  Coffee decoratedCoffee;
    public CoffeeDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }
    public double getCost(){
        return decoratedCoffee.getCost();
    }
}
class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }
    public String getDescription(){
        return super.getDescription()+"Milk";
    }
    public double getCost(){
        return super.getCost()+1.0;
    }
}
class WhipDecorator extends CoffeeDecorator{
    public WhipDecorator(Coffee decoratedCoffee){
        super(decoratedCoffee);
    }
    public String getDescription(){
        return super.getDescription()+"Whip";
    }
    public double getCost(){
        return super.getCost()+0.5;
    }
}
public class DecoratorPattern{//<- structural pattern
    public static void main(String[] args){
        Coffee coffee = new SimpleCoffee();
        //decorate with milk
        coffee = new MilkDecorator(coffee);
        System.out.println("Description: "+coffee.getDescription());
        System.out.println("Cost: $"+coffee.getCost());
        //decorate with whip
        coffee = new WhipDecorator(coffee);
        System.out.println("Description: "+coffee.getDescription());
        System.out.println("Cost: $"+coffee.getCost());
    }
}
