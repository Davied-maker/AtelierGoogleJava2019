package lab5.exchange;

public class ExchangeDesk {
    public <T extends Currency,V extends Currency> T convert(V from, Class<T> dest, double rate){
        T toReturn = null;
        double value = from.getAmount() * rate;
        try {
            toReturn =dest.getDeclaredConstructor().newInstance();
            toReturn.setAmount(value);
        } catch (Exception e) {
                e.printStackTrace();
            }
        return toReturn;
    }
}
