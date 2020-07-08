package capitulo_04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01_cap04 {
    public static void main(String[] args) {

//        Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//        mensagem explicativa, conforme exemplos.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        int valor1 = sc.nextInt();
        System.out.println("Insira o segundo valor:");
        int valor2 = sc.nextInt();
        int resultado = valor1 + valor2;
        System.out.printf("O resultado da soma desses dois valores é: %d.%n%n", resultado);
        sc.close();
    }
}