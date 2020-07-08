package capitulo_05_estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_07 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1041.java
//      Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//      de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//      ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//      Se o ponto estiver na origem, escreva a mensagem “Origem”.
//      Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//          |y
//       Q2 | Q1 x
//      ----|----
//       Q3 | Q4
//
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor com uma casa decimal para ser atribuído à X");
        double x = sc.nextDouble();
        System.out.println("Insira um valor com uma casa decimal para ser atribuído à Y");
        double y = sc.nextDouble();
        sc.close();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        else if (x == 0.0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0.0) {
            System.out.println("Eixo X");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Quadrante 1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Quadrante 2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Quadrante 3");
        }
        else {
            System.out.println("Quadrante 4");
        }

    }
}
