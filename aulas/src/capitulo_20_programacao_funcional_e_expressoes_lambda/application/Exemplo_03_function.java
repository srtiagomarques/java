package capitulo_20_programacao_funcional_e_expressoes_lambda.application;

import capitulo_20_programacao_funcional_e_expressoes_lambda.entities.Product_function;
import capitulo_20_programacao_funcional_e_expressoes_lambda.util.PriceUpdate;
import capitulo_20_programacao_funcional_e_expressoes_lambda.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Exemplo_03_function {
    public static void main(String[] args) {

//        Fazer um programa que, a partir de uma lista de produtos, gere uma
//        nova lista contendo os nomes dos produtos em caixa alta.

        List<Product_function> list = new ArrayList<>();
        list.add(new Product_function("Tv", 900.00));
        list.add(new Product_function("Mouse", 50.00));
        list.add(new Product_function("Tablet", 350.50));
        list.add(new Product_function("HD Case", 80.90));

//        Implementação de interface
//        list.stream() = converte a lista para stream
//        map = Aplica o UppercaseName a cada elemento da lista
//        collect = converte a lista stream para list
        List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());

//        Reference method com método estático
//        List<String> names = list.stream().map(Product_function::staticUpperCaseName).collect(Collectors.toList());

//        Reference method com método não estático
//        List<String> names = list.stream().map(Product_function::nonStaticUpperCaseName).collect(Collectors.toList());

//        Expressão lambda declarada
//        Function<Product_function, String> func = p -> p.getName().toUpperCase();
//        List<String> names = list.stream().map(func).collect(Collectors.toList());

//        Expressão lambda inline
//        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        names.forEach(System.out::println);
    }
}
