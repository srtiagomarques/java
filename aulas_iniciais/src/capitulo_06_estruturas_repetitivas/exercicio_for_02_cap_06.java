package capitulo_06_estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_for_02_cap_06 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1072.java
//      Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//      Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//      essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número inteiro represntando a quantidade de números que serão digitados.");
        int n = sc.nextInt();
        int in = 0;
        int out = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Insira um número para verificação de qual está no intervalo de 10 a 20");
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in += 1;
            } else {
                out += 1;
            }
        }
        System.out.printf("%d in.%n", in);
        System.out.printf("%d out.%n", out);
        sc.close();
    }
}
