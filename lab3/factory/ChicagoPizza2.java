package lab3.factory;

public class ChicagoPizza2 extends Pizza {
    public ChicagoPizza2(String name) {
        super(name);
    }


    @Override
    public void prepare() {
        System.out.println("prepare ch2");
        setDaugh("sweet Chicago ch2");
        setSauce("sweetch2");
    }
}