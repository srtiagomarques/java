package capitulo_04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05 {
    public static void main(String[] args) {

//      Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//      código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o código da primeira peça.");
        int codigoDaPeca = sc.nextInt();
        System.out.println("Insira a quantidade de peças.");
        int quantidadeDePecas = sc.nextInt();
        System.out.println("Insira o valor unitário da peça.");
        double valorPorPeca = sc.nextDouble();
        System.out.println("Insira o código da segunda peça.");
        int codigoDaPeca2 = sc.nextInt();
        System.out.println("Insira a quantidade de peças.");
        int quantidadeDePecas2 = sc.nextInt();
        System.out.println("Insira o valor unitário da peça.");
        double valorPorPeca2 = sc.nextDouble();
        double valorDoPedido = (quantidadeDePecas * valorPorPeca) + (quantidadeDePecas2 * valorPorPeca2);
        System.out.printf("O valor do pedido é de R$ %.2f.%n%n", valorDoPedido);
        sc.close();
    }
}
