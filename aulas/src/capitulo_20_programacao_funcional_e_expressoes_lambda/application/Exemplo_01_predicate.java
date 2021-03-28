package capitulo_20_programacao_funcional_e_expressoes_lambda.application;

import capitulo_20_programacao_funcional_e_expressoes_lambda.entities.Product_predicate;
import capitulo_20_programacao_funcional_e_expressoes_lambda.util.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exemplo_01_predicate {
    public static void main(String[] args) {

//        Fazer um programa que, a partir de uma lista de produtos, remova da
//        lista somente aqueles cujo preço mínimo seja 100.

        List<Product_predicate> list = new ArrayList<>();

        list.add(new Product_predicate("Tv", 900.00));
        list.add(new Product_predicate("Mouse", 50.00));
        list.add(new Product_predicate("Tablet", 350.50));
        list.add(new Product_predicate("HD Case", 80.90));

//        Implementação de interface
//        list.removeIf(new ProductPredicate());

//        Reference method com método estático
//        list.removeIf(Product_predicate::staticProductPredicate);

//        Reference method com método não estático
//        list.removeIf(Product_predicate::nonStaticProductPredicate);

//        Expressão lambda declarada
//        double min = 100.0;
//        Predicate<Product_predicate> pred = p -> p.getPrice() >= min;
//        list.removeIf(pred);

//        Expressão lambda inline
        double min = 100.0;
        list.removeIf(p -> p.getPrice() >= min);

        for (Product_predicate p : list) {
            System.out.println(p);
        }
    }
}
