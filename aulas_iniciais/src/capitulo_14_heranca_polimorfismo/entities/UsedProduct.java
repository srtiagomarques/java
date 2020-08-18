package capitulo_14_heranca_polimorfismo.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {

    private Date manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProduct(String name, Double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManofactureDate() {
        return manufactureDate;
    }

    public void setManofactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return getName()
                + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + df.format(manufactureDate)
                + ")";
    }

}
