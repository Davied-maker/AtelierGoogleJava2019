package lab5.exchange;

public class Main {
    public static void main(String[] args) {
        Ron ron= new Ron();
        ron.setAmount(4);
        ExchangeDesk exchange = new ExchangeDesk();
        Currency currency = exchange.convert(ron, USD.class, 0.25);
        System.out.println(currency);
    }
}
