package capitulo_04_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_04_cap04 {
    public static void main(String[] args) {

//      Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//      hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//      decimais.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o número do funcionário.");
        int funcionario = sc.nextInt();
        System.out.println("Insira a quantidade de horas trabalhadas desse funcionário.");
        int horasTrabalhadas = sc.nextInt();
        System.out.println("Insira o valor da hora desse funcionário.");
        double valorPorHora = sc.nextDouble();
        double salario = valorPorHora * horasTrabalhadas;
        System.out.printf("O funcionário de número %d, recebe um salário de U$ %.2f.%n%n", funcionario, salario);
        sc.close();
    }
}
