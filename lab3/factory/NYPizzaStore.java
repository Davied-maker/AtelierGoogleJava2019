package lab3.factory;

public class NYPizzaStore extends AbstractFactory {
    public Pizza createPizza(String pizzaName){
        Pizza pizza=new NYPizza(pizzaName);
        System.out.println("Create in NY style");
        return pizza;
    }
}
