package capitulo_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_for_07_cap_06 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1143.java
//      Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//      começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//      exemplo.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número ao qual deseja saber seu quadrado e cubo.");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("O número %d, tem o quadrado %d e o cubo %d.%n",i, quadrado, cubo);
        }
        sc.close();
    }
}
