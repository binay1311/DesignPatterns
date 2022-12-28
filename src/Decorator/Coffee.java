package Decorator;

public abstract class Coffee {
    String description = "Unknown Coffee";
    public abstract double cost();

    public String getDescription(){
        return description;
    }
}
