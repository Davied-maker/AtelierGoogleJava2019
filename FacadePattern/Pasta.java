package FacadePattern;

public class Pasta implements Food{
    public String preparedItem;
    @Override
    public void prepareFood(String itemsRequired) {
        preparedItem="Tomato pasta with ingredients - " + itemsRequired;
    }

    @Override
    public String deliverFood() {
        return preparedItem;
    }
}
