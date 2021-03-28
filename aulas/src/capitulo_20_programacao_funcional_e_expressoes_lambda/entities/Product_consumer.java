package capitulo_20_programacao_funcional_e_expressoes_lambda.entities;

public class Product_consumer {

    private String name;
    private Double price;

    public Product_consumer() {
    }

    public Product_consumer(String name, Double price) {
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

    public static void staticPriceUpdate(Product_consumer p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    public void nonStaticPriceUpdate(Product_consumer p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + String.format("%.2f", price) + "]";
    }

}
