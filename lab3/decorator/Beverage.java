package lab3.decorator;

public abstract class Beverage {
    private int cost;
    private String description;

    public Beverage(String description, int cost){
        this.cost=cost;
        this.description=description;
    }

    public int getCost() {
        return cost;
    }

    public String getDescription() {
        return description;
    }
}
