package capitulo_08_poo.application;

import capitulo_08_poo.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01_cap_08 {
    public static void main(String[] args) {

//      Fazer um programa para ler os valores da largura e altura
//      de um retângulo. Em seguida, mostrar na tela o valor de
//      sua área, perímetro e diagonal. Usar uma classe como
//      mostrado no projeto ao lado

//      Rectangle
//      ----------------------
//      - Width : double
//      - Height : double
//      ----------------------
//      + Area() : double
//      + Perimeter() : double
//      + Diagonal() : double

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println();
        System.out.println("Enter rectangle width: ");
        rectangle.width = sc.nextDouble();
        System.out.println("Enter rectangle height: ");
        rectangle.height = sc.nextDouble();

        System.out.printf("Area = %.2f.%n", rectangle.area());
        System.out.printf("Perimeter = %.2f.%n", rectangle.perimeter());
        System.out.printf("Diagonal = %.2f.%n", rectangle.diagonal());

        sc.close();
    }
}
