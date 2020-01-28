package lab3.decorator;

public class Milk extends CondimentDecorator {
    public Milk(Beverage beverage){
      super("Milk ",2,beverage);

    }
}
