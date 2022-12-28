package Decorator;

public class WithMilk extends CoffeeDecorator{
    Coffee coffee;

    public WithMilk(Coffee coffee){
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + 50.00;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", Milk";
    }
}
