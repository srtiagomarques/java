package capitulo_20_programacao_funcional_e_expressoes_lambda.util;

import capitulo_20_programacao_funcional_e_expressoes_lambda.entities.Product_consumer;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product_consumer> {
    @Override
    public void accept(Product_consumer p) {
        p.setPrice(p.getPrice() *1.1);
    }
}
