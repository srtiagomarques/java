package capitulo_19_generics.model.entities;

import java.util.Objects;

public class Product3 implements Comparable<Product3> {

    private String name;
    private Double price;

    public Product3(String name, Double price) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product3 product2 = (Product3) o;
        return Objects.equals(name, product2.name) && Objects.equals(price, product2.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product3 other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }
}
