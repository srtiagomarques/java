package capitulo_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_for_03_cap_06 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1079.java
//      Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
//      de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
//      conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
//      peso 5.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a quantidade de testes que vem a seguir.");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Insira o primeiro valor real, com uma casa decimal:");
            double n1 = sc.nextDouble();
            System.out.println("Insira o segundo valor real, com uma casa decimal:");
            double n2 = sc.nextDouble();
            System.out.println("Insira o terceiro valor real, com uma casa decimal:");
            double n3 = sc.nextDouble();
            double media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0) / 10.0;

            System.out.printf("A média ponderada desses valores é de: %.1f%n", media);
        }
        sc.close();
    }
}
