package capitulo_20_programacao_funcional_e_expressoes_lambda.services;

import capitulo_20_programacao_funcional_e_expressoes_lambda.entities.Product_funcao_como_parametro;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public double filteredSum(List<Product_funcao_como_parametro> list, Predicate<Product_funcao_como_parametro> criteria) {
        double sum = 0.0;
        for (Product_funcao_como_parametro p : list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }

}
