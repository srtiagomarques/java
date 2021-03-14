package capitulo_05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03_cap_05 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
//      Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//      Multiplos", indicando se os valores

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro.");
        int a = sc.nextInt();
        System.out.println("Insira outro número inteiro.");
        int b = sc.nextInt();
        if (a % b == 0 || b % a == 0) {
            System.out.println("Sao Multiplos.%n");
        } else {
            System.out.println("Nao sao Multiplos.%n");
        }
        sc.close();
    }
}
