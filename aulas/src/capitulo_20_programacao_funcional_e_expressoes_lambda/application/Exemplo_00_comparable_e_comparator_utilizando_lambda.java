package capitulo_20_programacao_funcional_e_expressoes_lambda.application;

import capitulo_20_programacao_funcional_e_expressoes_lambda.entities.Product;
import capitulo_20_programacao_funcional_e_expressoes_lambda.entities.Product_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exemplo_00_comparable_e_comparator_utilizando_lambda {
    public static void main(String[] args) {

//      Suponha uma classe Product com os atributos name e price.

//      Podemos implementar a comparação de produtos por meio da implementação da interface Comparable<Product>

//      Entretanto, desta forma nossa classe não fica fechada para alteração: se o critério de comparação mudar,
//      precisaremos alterar a classe Product.

//      Podemos então usar o default method "sort" da interface List: default void sort(Comparator<? super E> c)

//        |-----------------|
//        |      Product    |
//        |-----------------|
//        | - name: String  |
//        | - price: Double |
//        |-----------------|

//        Com comparable

        List<Product_comparable> list_com_comparable = new ArrayList<>();

        list_com_comparable.add(new Product_comparable("TV", 900.00));
        list_com_comparable.add(new Product_comparable("Notebook", 1200.00));
        list_com_comparable.add(new Product_comparable("Tablet", 450.00));

        Collections.sort(list_com_comparable);

        for (Product_comparable p : list_com_comparable) {
            System.out.println(p);
        }

//        Com comparator

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

//        Como argumento do sort foi utilizado uma função lambda (função anônima)
        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

//        Com uma interface funcional
//        list.sort(new MyComparator());

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
