package capitulo_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01_cap_06 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1114.java
//      Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//      incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//      impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a senha.");
        String senha = sc.next();
        while (!senha.equals("2002")) {
            System.out.println("Senha inválida :(");
            System.out.println("Insira a senha.");
            senha = sc.next();
        }
        System.out.println("Acesso permitido :)");
        sc.close();
    }
}
