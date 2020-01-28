package lab3.factory;

public abstract class AbstractFactory {
    public abstract Pizza createPizza(String PizzaName);

    public Pizza orderPizza(String pizzaName){
        Pizza pizza= createPizza(pizzaName);
        pizza.prepare();
        pizza.cut();
        pizza.bake();
        pizza.box();
        return pizza;
    }
}
