package lab3.factory;

public class NYPizza extends Pizza{
    public NYPizza(String pizzaName){
        super(pizzaName);
    }
    public void prepare(){
        System.out.println("Prepare NYPizza");
        setDaugh("crispy");
        setSauce("spicey");
    }
}
