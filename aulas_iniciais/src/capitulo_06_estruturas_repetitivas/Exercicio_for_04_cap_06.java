package capitulo_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_for_04_cap_06 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1116.java
//      Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//      segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira quantas divisões deseja efetuar.");
        int n = sc.nextInt();
        double divisao;
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o primeiro número da divisão.");
            int n1 = sc.nextInt();
            System.out.println("Insira o segundo número da divisão.");
            int n2 = sc.nextInt();
            if (n2 == 0) {
                System.out.println("divisão impossível.");
            } else {
                divisao = (double) n1 / n2;
                System.out.printf("O resultado da divisão é %.1f.%n%n", divisao);
            }
        }
    }
}
