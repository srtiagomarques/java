package capitulo_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03_cap_06 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1134.java
//      Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
//      um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
//      4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
//      que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
//      mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
//      exemplo:

//      Entrada:|    Saída:
//      8       |    MUITO OBRIGADO
//      1       |    Alcool: 1
//      7       |    Gasolina: 2
//      2       |    Diesel: 0
//      2       |
//      4       |

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o código do produto desejado.");
        int combustivel = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while (combustivel != 4) {
            if (combustivel == 1) {
                alcool += 1;
            } else if (combustivel == 2) {
                gasolina += 1;
            } else if (combustivel == 3) {
                diesel += 1;
            } else {
                System.out.println("Código inválido.");
            }
            System.out.println("Insira o código do produto desejado.");
            combustivel = sc.nextInt();
        }
        System.out.printf("%d cliente(s) abasteceram com álcool.%n", alcool);
        System.out.printf("%d cliente(s) abasteceram com gasolina.%n", gasolina);
        System.out.printf("%d cliente(s) abasteceram com diesel.%n", diesel);
        System.out.println("Muito Obrigado!");
        sc.close();
    }
}
