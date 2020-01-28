package lab3.decorator;

public abstract class CondimentDecorator extends Beverage{
    private Beverage beverage;

    public CondimentDecorator(String description, int cost, Beverage beverage){
        super(description,cost);
        this.beverage=beverage;
    }
    public String getDescription(){
        return beverage.getDescription() + ", " + super.getDescription();
    }
    public int getCost(){
        return beverage.getCost()  + super.getCost();
    }
}
