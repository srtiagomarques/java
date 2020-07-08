package capitulo_05_estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio_08_cap05 {
    public static void main(String[] args) {

//      Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1051.java
//      Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
//      que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
//      qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
//      Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
//      mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.
//      Renda                       |   Imposto de renda
//      de R$ 0.00 a R$ 2000.00     |   Isento
//      de R$ 2000.01 a R$ 3000.00  |   8%
//      de R$ 3000.01 a R$ 4500.00  |   18%
//      acima de R$ 4500.00         |   28%

//      Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
//      salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
//      de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
//      duas casas decimais.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor da renda do habitante de Lisarb.");
        double renda = sc.nextDouble();
        double ir = 0;
        if (renda <= 2000) {
            System.out.println("Cidadão isento de imposto de renda.");
            return;
        } else if (renda >= 2000.01 && renda <= 3000) {
            ir = (renda - 2000.0) * 0.08;
        } else if (renda >= 3000.01 && renda <= 4500) {
            ir = (renda - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            ir = (renda - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }
        System.out.printf("O valor do imposto de renda do cidadão é de %.2f.%n%n", ir);
        sc.close();
    }
}
