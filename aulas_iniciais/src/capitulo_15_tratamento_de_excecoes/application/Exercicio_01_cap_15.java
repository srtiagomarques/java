package capitulo_15_tratamento_de_excecoes.application;

import capitulo_15_tratamento_de_excecoes.model.entities.Account;
import capitulo_15_tratamento_de_excecoes.model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01_cap_15 {
    public static void main(String[] args) {

//        Fazer um programa para ler os dados de uma conta bancária e depois realizar um
//        saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
//        ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
//        saque da conta. Implemente a conta bancária conforme projeto abaixo:
//
//                    |----------------------------------|
//                    |             Account              |
//                    |----------------------------------|
//                    | - number : Integer               |
//                    | - holder : String                |
//                    | - balance : Double               |
//                    | - withdrawLimit : Double         |
//                    |----------------------------------|
//                    | + deposit(amount: Double): void  |
//                    | + withdraw(amount: Double): void |
//                    |----------------------------------|

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        Integer number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        Double balance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        Double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, balance, withdrawLimit);

        System.out.print("Enter amount for withdraw: ");
        Double amount = sc.nextDouble();
        try {
            account.withdraw(amount);
            System.out.println("New balance: " + String.format("%.2f", account.getBalance()));
        } catch (DomainException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        }

        sc.close();
    }
}
