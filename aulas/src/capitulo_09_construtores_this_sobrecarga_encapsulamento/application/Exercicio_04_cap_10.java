package capitulo_09_construtores_this_sobrecarga_encapsulamento.application;

import java.util.Scanner;

public class Exercicio_04_cap_10 {
    public static void main(String[] args) {

//        Fazer um programa para ler dois números inteiros M e N, e depois ler
//        uma matriz de M linhas por N colunas contendo números inteiros,
//                podendo haver repetições. Em seguida, ler um número inteiro X que
//        pertence à matriz. Para cada ocorrência de X, mostrar os valores à
//        esquerda, acima, à direita e abaixo de X, quando houver, conforme
//        exemplo.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the row number for the matrix: ");
        int m = sc.nextInt();
        System.out.print("Enter the column number for the matrix: ");
        int n = sc.nextInt();
        int[][] mat = new int[m][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print("Enter the value for row " + i + " and column " + j + ": ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the number you want to know who is next to him: ");
        int x = sc.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j);
                    if ((j - 1) >= 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if ((j + 1) < n) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if ((i - 1) >= 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if ((i + 1) < m) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                }
            }
        }
    }
}
