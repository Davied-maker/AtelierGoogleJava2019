package lab3.factory;

public class ChicagoPizza extends Pizza {

    public ChicagoPizza (String pizzaName){
        super(pizzaName);
    }
    @Override
    public void prepare(){
        System.out.println("prepare");
        setDaugh("sweet Chicago");
        setSauce("sweet");
    }
}
