package capitulo_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_for_05_cap_06 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1153.java
//      Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//      Lembrando que, por definição, fatorial de 0 é 1.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número ao qual deseja saber seu fatorial.");
        int n = sc.nextInt();
        int fator = 1;
        for (int i = 1; i <= n; i++) {
            fator *= i;
        }
        System.out.printf("O fator de %d é %d.%n", n, fator);
        sc.close();
    }
}
