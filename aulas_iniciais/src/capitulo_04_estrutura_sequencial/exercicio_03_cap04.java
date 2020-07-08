package capitulo_04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_03_cap04 {
    public static void main(String[] args) {

//      Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//      de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        int a = sc.nextInt();
        System.out.println("Insira o segundo valor:");
        int b = sc.nextInt();
        System.out.println("Insira o terceiro valor:");
        int c = sc.nextInt();
        System.out.println("Insira o quarto valor:");
        int d = sc.nextInt();
        int diferenca = a * b - c * d;
        System.out.printf("A diferença do produto desses valores é: %d.%n%n", diferenca);
        sc.close();
    }
}
