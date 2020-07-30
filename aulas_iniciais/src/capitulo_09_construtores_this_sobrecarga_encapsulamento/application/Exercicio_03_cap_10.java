package capitulo_09_construtores_this_sobrecarga_encapsulamento.application;

import java.util.Scanner;

public class Exercicio_03_cap_10 {
    public static void main(String[] args) {

//        Fazer um programa para ler um número inteiro N e uma matriz de
//        ordem N contendo números inteiros. Em seguida, mostrar a diagonal
//        principal e a quantidade de valores negativos da matriz.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row and column number for the matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Enter the value for row " + i + " and column " + j + ": ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main diagonal: ");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    count++;
                }
            }
        }

        System.out.println("Negative numbers = " + count);
        sc.close();
    }
}
