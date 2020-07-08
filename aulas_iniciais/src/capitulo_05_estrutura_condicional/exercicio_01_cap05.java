package capitulo_05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_01_cap05 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
//      Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro.");
        int numero = sc.nextInt();
        if (numero < 0) {
            System.out.println("Este número é negativo.%n");
        } else {
            System.out.println("Este número não é negativo.%n");
        }
        sc.close();
    }
}
