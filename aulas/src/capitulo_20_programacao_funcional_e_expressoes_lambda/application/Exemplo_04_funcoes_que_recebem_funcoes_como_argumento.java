package capitulo_20_programacao_funcional_e_expressoes_lambda.application;

import capitulo_20_programacao_funcional_e_expressoes_lambda.entities.Product_funcao_como_parametro;
import capitulo_20_programacao_funcional_e_expressoes_lambda.services.ProductService;

import java.util.ArrayList;
import java.util.List;

public class Exemplo_04_funcoes_que_recebem_funcoes_como_argumento {
    public static void main(String[] args) {

//        Fazer um programa que, a partir de uma lista de produtos, calcule a
//        soma dos preços somente dos produtos cujo nome começa com "T".

        List<Product_funcao_como_parametro> list = new ArrayList<>();

        list.add(new Product_funcao_como_parametro("Tv", 900.00));
        list.add(new Product_funcao_como_parametro("Mouse", 50.00));
        list.add(new Product_funcao_como_parametro("Tablet", 350.50));
        list.add(new Product_funcao_como_parametro("HD Case", 80.90));

        ProductService ps = new ProductService();

//        Mostra a soma de todos os produtos que comecem com T
        double sum = ps.filteredSum(list, p -> p.getName().charAt(0) == 'T');
//        Mostra a soma de todos os produtos que tem valor menor que 100
//        double sum = ps.filteredSum(list, p -> p.getPrice() < 100);

        System.out.println("Sum = " + String.format("%.2f", sum));

    }
}
