package capitulo_14_heranca_polimorfismo.entities;

public class Company extends TaxPayer {
    private int numberOfEmployees;

    public Company() {
        super();
    }

    public Company(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public Company(String name, Double anualIncome, int numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        Double tax = 0.0;
        if (getNumberOfEmployees() <= 10) {
            tax = getAnualIncome() * 16 / 100;
        } else {
            tax = getAnualIncome() * 14 / 100;
        }
        return tax;
    }
}
