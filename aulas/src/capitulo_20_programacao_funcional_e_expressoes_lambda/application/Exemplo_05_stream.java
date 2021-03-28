package capitulo_20_programacao_funcional_e_expressoes_lambda.application;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Exemplo_05_stream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);
//        Criar stream a partir de uma lista
        Stream<Integer> st1 = list.stream();
//        .toArray = converte a stream para um vetor
        System.out.println(Arrays.toString(st1.toArray()));
//        multiplicar cada elemento da stream por 10
        Stream<Integer> st1_x10 = list.stream().map(x -> x * 10);
        System.out.println(Arrays.toString(st1_x10.toArray()));

//       .of permite colocar os elementos diretamente entre parenteses
        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));

//        .iterate informado o primeiro elemento, qual a função de iteração e geração dos próximos elementos
        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);
//        .limit(10) limita a stream em 10 elementos
        System.out.println(Arrays.toString(st3.limit(10).toArray()));

//        Stream que gera a sequência de Fibonati
        Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
        System.out.println(Arrays.toString(st4.limit(10).toArray()));

    }
}
