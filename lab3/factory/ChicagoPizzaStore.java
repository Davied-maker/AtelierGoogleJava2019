package lab3.factory;

public class ChicagoPizzaStore extends AbstractFactory {
    public Pizza createPizza(String pizzaName){
        Pizza pizza=null;
        if(pizzaName== "Chicago1"){
             pizza = new ChicagoPizza(pizzaName);
        }else{
            if(pizzaName=="Chicago2"){
                 pizza = new ChicagoPizza2(pizzaName);

            }
        }
        System.out.println("Made in Chigaco");
        System.out.println("Extra step");
        return pizza;
    }
}
