package capitulo_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_for_01_cap_06 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1067.java
//      Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
//      X, se for o caso.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("insira um valor inteiro.");
        int x = sc.nextInt();
        int impar = 1;
        for (int i = 1; i < x; i++) {
            if (i % 2 != 0) {
                impar = i;
                System.out.printf("%d%n", impar);
            }
        }
        sc.close();
    }
}
