package capitulo_20_programacao_funcional_e_expressoes_lambda.entities;

public class Product_funcao_como_parametro {

    private String name;
    private Double price;

    public Product_funcao_como_parametro() {
    }

    public Product_funcao_como_parametro(String name, Double price) {
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

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + String.format("%.2f", price) + "]";
    }

}
