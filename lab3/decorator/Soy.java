package lab3.decorator;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage){
        super("Soy ",1,beverage);
    }
}
