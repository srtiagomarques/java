package capitulo_20_programacao_funcional_e_expressoes_lambda.util;

import capitulo_20_programacao_funcional_e_expressoes_lambda.entities.Product_function;

import java.util.function.Function;

public class UpperCaseName implements Function<Product_function, String> {
    @Override
    public String apply(Product_function p) {
        return p.getName().toUpperCase();
    }
}
