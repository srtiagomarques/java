package capitulo_08_poo.entities;

public class CurrencyConverter {

    public static double dollarPrice;
    public static double dollarAmount;

    public static double amountPaidReais(){
        return dollarAmount * dollarPrice + (dollarAmount * dollarPrice * 0.06);
    }
}
