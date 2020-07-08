package capitulo_05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_05_cap05 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java
//      Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//      seguir, calcule e mostre o valor da conta a pagar.

//      Codigo  |   Especificação   |   Preço
//      1       |   Cachorro quente |   R$ 4.00
//      2       |   X-Salada        |   R$ 4.50
//      3       |   X-Bacon         |   R$ 5.00
//      4       |   Torrada Simples |   R$ 2.00
//      5       |   Refrigerante    |   R$ 1.50

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o código do pedido.");
        int codigo = sc.nextInt();
        System.out.println("Insira a quantidade.");
        int quantidade = sc.nextInt();
        double valor;
        String especificacao;
        switch (codigo) {
            case 1:
                especificacao = "Cachorro quente";
                valor = quantidade * 4.0;
                break;
            case 2:
                especificacao = "X-Salada";
                valor = quantidade * 4.5;
                break;
            case 3:
                especificacao = "X-Bacon";
                valor = quantidade * 5.0;
                break;
            case 4:
                especificacao = "Torrada Simples";
                valor = quantidade * 2.0;
                break;
            case 5:
                especificacao = "Refrigerante";
                valor = quantidade * 1.5;
                break;
            default:
                throw new IllegalStateException("Código não cadastrado: " + codigo);
        }
        System.out.printf("O item solicitado foi %s, a quantidade é %d, e o valor do pedido ficou em R$ %.2f.%n%n", especificacao, quantidade, valor);
        sc.close();
    }
}
