package capitulo_19_generics.application;

import capitulo_19_generics.services.PrintService;

import java.util.Scanner;

public class Exercicio_00_cap_19_ordenacao_lista_qualquer_tipo {
    public static void main(String[] args) {

//        Deseja-se fazer um programa que leia uma quantidade N, e depois N números
//        inteiros. Ao final, imprima esses números de forma organizada conforme
//        exemplo. Em seguida, informar qual foi o primeiro valor informado.

        Scanner sc = new Scanner(System.in);

        PrintService<Integer> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Integer value = sc.nextInt();
            ps.addValue(value);
        }

        ps.print();
        Integer x = ps.first();
        System.out.println("First: " + x);

        sc.close();

    }
}
