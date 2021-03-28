package capitulo_20_programacao_funcional_e_expressoes_lambda.application;

import capitulo_20_programacao_funcional_e_expressoes_lambda.entities.Product_consumer;
import capitulo_20_programacao_funcional_e_expressoes_lambda.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;

public class Exemplo_02_consumer {
    public static void main(String[] args) {

//        Fazer um programa que, a partir de uma lista de produtos, aumente o
//        preço dos produtos em 10%.

        List<Product_consumer> list = new ArrayList<>();

        list.add(new Product_consumer("Tv", 900.00));
        list.add(new Product_consumer("Mouse", 50.00));
        list.add(new Product_consumer("Tablet", 350.50));
        list.add(new Product_consumer("HD Case", 80.90));


//        Implementação de interface
        list.forEach(new PriceUpdate());

//        Reference method com método estático
//        list.forEach(Product_consumer::staticPriceUpdate);

//        Reference method com método não estático
//        list.forEach(Product_consumer::nonStaticProductPredicate);

//        Expressão lambda declarada
//        double factor = 1.1;
//        Consumer<Product_consumer> cons = p -> p {
//          p.setPrice(p.getPrice() * factor);
//        };
//        list.forEach(cons);

//        Expressão lambda inline
//        double factor = 1.1;
//        list.forEach(p -> p.setPrice(p.getPrice() * factor);

        list.forEach(System.out::println);

    }
}
