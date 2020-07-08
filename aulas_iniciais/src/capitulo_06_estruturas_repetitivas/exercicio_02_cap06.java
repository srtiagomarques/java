package capitulo_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_02_cap06 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1115.java
//      Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//      cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
//      menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor para X:");
        int x = sc.nextInt();
        System.out.println("Insira um valor para Y:");
        int y = sc.nextInt();
        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                System.out.println("Primeiro.");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo.");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro.");
            } else {
                System.out.println("Quarto.");
            }
            System.out.println("Insira um valor para X:");
            x = sc.nextInt();
            System.out.println("Insira um valor para Y:");
            y = sc.nextInt();
        }
        sc.close();
    }
}
