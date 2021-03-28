package capitulo_20_programacao_funcional_e_expressoes_lambda.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo_06_pipelines {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

//        Gerar uma stream a partir da primeira lista multiplicando cada elemento por 10
        Stream<Integer> st1 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1.toArray()));

//        .reduce = Primeiro elemento é um elemento inicial e em seguida uma função que recebe dois argumentos e gera um resultado
//        Essa função ira somar os valores da variável list
        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);

//        .filter = filtra minha lista com base em um predicado, nesse caso quero os elementos pares
//        .map = vou transformar em outra stream multiplicando os valores do filter por 10
//        .collect = vou transfomar esse stream resultante em uma lista
        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(newList.toArray()));

    }
}
