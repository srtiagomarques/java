package capitulo_09_construtores_this_sobrecarga_encapsulamento.application;

import capitulo_09_construtores_this_sobrecarga_encapsulamento.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01_cap_09 {
    public static void main(String[] args) {

//      Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do
//      titular da conta, e o valor do depósito inicial que o titular depositou ao abrir a conta. Este valor de
//      depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositarno momento
//      de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.
//
//      Importante: uma vez que a conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já
//      o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por
//      exemplo).
//
//      Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger
//      isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado,
//      o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente
//      para realizar o saque e/ou pagar a taxa.
//
//      Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não
//      informado o valor do depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre
//      mostrando os dados da conta após cada operação.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.println("Insira o número da conta.");
        int accountNumber = sc.nextInt();
        System.out.println("Informe o nome do titular.");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Efetuar depósito inicial? s/n");
        String makeInitialDeposit = sc.next();
        if (makeInitialDeposit.equals("s")) {
            System.out.println("Insira o valor do depósito inicial");
            double initialDeposit = sc.nextDouble();
            account = new Account(accountNumber, name, initialDeposit);
        } else if (makeInitialDeposit.equals("n")) {
            account = new Account(accountNumber, name);
        } else {
            System.out.println("Opção incorreta.");
            account = new Account();
        }
        System.out.println("Conta atualizada.");
        System.out.println(account);
        System.out.println("Insira o valor do depósito");
        double depositValue = sc.nextDouble();
        account.makeDeposit(depositValue);
        System.out.println("Conta atualizada.");
        System.out.println(account);
        System.out.println("Insira o valor de saque");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Conta atualizada.");
        System.out.println(account);
        sc.close();
    }
}
