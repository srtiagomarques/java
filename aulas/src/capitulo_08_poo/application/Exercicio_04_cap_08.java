package capitulo_08_poo.application;

import capitulo_08_poo.entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04_cap_08 {
    public static void main(String[] args) {

//      Faça um programa para ler a cotação do dólar, e depois um valor em dólares a ser comprado  por uma
//      pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda que a
//      pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter para ser
//      resonsável pelos cáculos.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("What is the dollar price?");
        CurrencyConverter.dollarPrice = sc.nextDouble();
        System.out.println("How many dollars will be boght?");
        CurrencyConverter.dollarAmount = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f.%n", CurrencyConverter.amountPaidReais());
    }
}
