package capitulo_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_for_06_cap_06 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1157.java
//      Ler um número inteiro N e calcular todos os seus divisores.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número ao qual deseja calcular todos seus divisores .");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.printf("%d é divisível por %d.%n", n, i);
            }
        }
    }
}
