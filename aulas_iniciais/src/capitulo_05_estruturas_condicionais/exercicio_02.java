package capitulo_05_estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
//      Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro.");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Este número é par.%n");
        } else {
            System.out.println("Este número é ímpar.%n");
        }
        sc.close();
    }
}
