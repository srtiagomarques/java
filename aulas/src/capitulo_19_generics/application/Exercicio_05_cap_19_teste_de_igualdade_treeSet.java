package capitulo_19_generics.application;

import capitulo_19_generics.model.entities.Product3;

import java.util.Set;
import java.util.TreeSet;

public class Exercicio_05_cap_19_teste_de_igualdade_treeSet {
    public static void main(String[] args) {

        Set<Product3> set = new TreeSet<>();

        set.add(new Product3("TV", 900.0));
        set.add(new Product3("Notebook", 1200.0));
        set.add(new Product3("Tablet", 400.0));

        for (Product3 p : set ) {
            System.out.println(p);
        }
    }
}
