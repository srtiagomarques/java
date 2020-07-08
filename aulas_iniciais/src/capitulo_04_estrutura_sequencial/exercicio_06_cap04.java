package capitulo_04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_06_cap04 {
    public static void main(String[] args) {

//      Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//      mostre:

//      a) a área do triângulo retângulo que tem A por base e C por altura.
//      b) a área do círculo de raio C. (pi = 3.14159)
//      c) a área do trapézio que tem A e B por bases e C por altura.
//      d) a área do quadrado que tem lado B.
//      e) a área do retângulo que tem lados A e B.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor para A.");
        double a = sc.nextDouble();
        System.out.println("Insira um valor para B.");
        double b = sc.nextDouble();
        System.out.println("Insira um valor para C.");
        double c = sc.nextDouble();
        double areaTriangulo = a * c / 2.0;
        System.out.printf("Triangulo: %.3f.%n%n", areaTriangulo);
        double areaCirculo = 3.14159 * c * c;
        System.out.printf("Circulo: %.3f.%n%n", areaCirculo);
        double areaTrapezio = (a + b) / 2.0 * c;
        System.out.printf("Trapezio: %.3f.%n%n", areaTrapezio);
        double areaQuadrado = b * b;
        System.out.printf("Quadrado: %.3f.%n%n", areaQuadrado);
        double areaRetangulo = a * b;
        System.out.printf("Retângulo: %.3f.%n%n", areaRetangulo);
        sc.close();
    }
}
