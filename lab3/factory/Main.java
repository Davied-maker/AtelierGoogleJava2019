package lab3.factory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory nyStore=new NYPizzaStore();
        AbstractFactory chicagoStore= new ChicagoPizzaStore();

        nyStore.orderPizza("Margerita");
        System.out.println("");
        chicagoStore.orderPizza("Chicago2");
    }
}
