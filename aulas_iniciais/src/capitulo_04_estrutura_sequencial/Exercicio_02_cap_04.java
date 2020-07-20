package capitulo_04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02_cap_04 {
    public static void main(String[] args) {
//      Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//      casas decimais conforme exemplos.
//      Fórmula da área: area = π . raio2
//      Considere o valor de π = 3.14159

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double Raio, Area, pi = 3.14159;
        System.out.println("Insira o valor do raio:");
        Raio = sc.nextDouble();
        Area = pi * Raio * Raio;
        System.out.printf("A=%.4f.%n%n", Area);
        sc.close();
    }
}
