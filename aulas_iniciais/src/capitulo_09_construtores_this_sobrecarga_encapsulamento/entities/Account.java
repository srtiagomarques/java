package capitulo_09_construtores_this_sobrecarga_encapsulamento.entities;

public class Account {
    private int accountNumber;
    private String name;
    private double balance;

    public Account() {

    }

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public Account(int accountNumber, String name, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.name = name;
        makeDeposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void makeDeposit(double deposit) {
        balance += deposit;
    }

    public void withdraw(double withdraw) {
        balance -= withdraw + 5.0;
    }

    public String toString() {
        return "Conta " + accountNumber + ", Cliente " + name + ", Saldo: " + String.format("%.2f", balance);
    }
}

