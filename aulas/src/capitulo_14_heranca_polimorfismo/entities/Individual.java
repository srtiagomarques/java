package capitulo_14_heranca_polimorfismo.entities;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual() {
        super();
    }

    public Individual(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        Double tax = 0.0;
        if(getAnualIncome() < 20000){
            tax = getAnualIncome() * 15 / 100;
        }
        else{
            tax = getAnualIncome() * 25 / 100;
        }
        if(healthExpenditures > 0){
            tax =  tax - (healthExpenditures * 50 / 100);
        }
        return tax;
    }
}
