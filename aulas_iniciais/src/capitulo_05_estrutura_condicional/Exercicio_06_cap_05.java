package capitulo_05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_06_cap_05 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java
//      Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//      seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//      nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor inteiro qualquer.");
        int valor = sc.nextInt();
        if (valor >= 0 && valor <= 25) {
            System.out.println("Este valor está no intervalo de 0 à 25");
        } else if (valor >= 25 && valor <= 50) {
            System.out.println("Este valor está no intervalo de 25 à 50");
        }
        else if (valor >= 50 && valor <= 75){
            System.out.println("Este valor está no intervalo de 50 à 75");
        }
        else if (valor >= 75 && valor <= 100){
            System.out.println("Este valor está no intervalo de 75 à 100");
        }
        else{
            System.out.println("Fora do intervalo");
        }
        sc.close();
    }
}
