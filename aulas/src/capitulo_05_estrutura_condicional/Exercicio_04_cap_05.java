package capitulo_05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_04_cap_05 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java
//      Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//      começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a hora inicial");
        int horaInicial = sc.nextInt();
        System.out.println("Insira a hora final");
        int horaFinal = sc.nextInt();
        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.printf("A duração do jogo foi de %d hora(s).%n%n", duracao);
        sc.close();
    }
}
