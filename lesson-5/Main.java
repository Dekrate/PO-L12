
public class Main {
    public static void main(String[] args) {
        Euro euro = new Euro(2.45F);
        System.out.println("Abbreviation: " + euro.abbreviation());
        System.out.println("Symbol: " + euro.symbol());
        System.out.println("Amount of euro: " + euro.balance() + "EUR");
        System.out.println("To Dollar Exchange Rate: " + euro.toDollarExchangeRate() + "EUR");
        Currency euro2 = euro.addedCurrency(3.45F, "USD");
        System.out.println("Euro when added 3.45 USD: " + euro2.balance() + "EUR");
        Currency usd1 = euro.subtractedCurrency(1.00F, "USD");
        System.out.println("Euro when subtracted 1.00 USD: " + usd1.balance());
        Currency eur3 = euro.subtractedCurrency(10.00F, "USD");
        System.out.println("Euro when subtracted 10.00 USD from 2.45 EUR: " + eur3 + "EUR");
    }
}