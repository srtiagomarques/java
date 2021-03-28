package capitulo_20_programacao_funcional_e_expressoes_lambda.entities;

public class Product_predicate {

    private String name;
    private Double price;

    public Product_predicate() {
    }

    public Product_predicate(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean staticProductPredicate(Product_predicate p) {
        return p.getPrice() >= 100.0;
    }

    public boolean nonStaticProductPredicate() {
        return price >= 100.0;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + String.format("%.2f", price) + "]";
    }

}
