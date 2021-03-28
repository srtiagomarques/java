package capitulo_20_programacao_funcional_e_expressoes_lambda.util;

import java.util.function.Predicate;

import capitulo_20_programacao_funcional_e_expressoes_lambda.entities.Product_predicate;

public class ProductPredicate implements Predicate<Product_predicate> {

    @Override
    public boolean test(Product_predicate p) {
        return p.getPrice() >= 100.0;
    }
}