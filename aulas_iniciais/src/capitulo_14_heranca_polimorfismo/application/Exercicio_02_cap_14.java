package capitulo_14_heranca_polimorfismo.application;

import capitulo_14_heranca_polimorfismo.entities.Company;
import capitulo_14_heranca_polimorfismo.entities.Individual;
import capitulo_14_heranca_polimorfismo.entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02_cap_14 {
    public static void main(String[] args) {

//        Fazer um programa para ler os dados de N contribuintes (N fornecido pelo usuário), os quais
//        podem ser pessoa física ou pessoa jurídica, e depois mostrar o valor do imposto pago por cada um,
//                bem como o total de imposto arrecadado.
//        Os dados de pessoa física são: nome, renda anual e gastos com saúde. Os dados de pessoa jurídica
//        são nome, renda anual e número de funcionários. As regras para cálculo de imposto são as
//        seguintes:
//        Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. Pessoas com
//        renda de 20000.00 em diante pagam 25% de imposto. Se a pessoa teve gastos com saúde, 50%
//                destes gastos são abatidos no imposto.
//                Exemplo: uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto
//        fica: (50000 * 25%) - (2000 * 50%) = 11500.00
//        Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10
//        funcionários, ela paga 14% de imposto.
//                Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica:
//        400000 * 14% = 56000.00
//
//                    |------------------------|
//                    |        TaxPayer        |
//                    |------------------------|
//                    | - name : String        |
//                    | - anualIncome : Double |
//                    |------------------------|
//                    | + tax() : Double       |
//                    |------------------------|
//                               /_\
//                                |
//              ----------------------------------------------
//              |                                            |
//              |                                            |
//   |------------------------------|                |---------------------------|
//   |          Individual          |                |         Company           |
//   |------------------------------|                |---------------------------|
//   | - healthExpenditures : Double|                | - numberOfEmployees : int |
//   |------------------------------|                |---------------------------|


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int taxPayersQuantity = sc.nextInt();

        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 0; i < taxPayersQuantity; i++) {
            System.out.println("Tax payer #" + (i + 1) + "  data:");
            System.out.print("Individual or company (i/c)? ");
            char indOrComp = sc.next().charAt(0);
//            if(indOrComp != 'i' && indOrComp != 'I' && indOrComp != 'c' && indOrComp != 'C'){
//                System.out.println("Invalid income tax");
//                return;
//            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();
            if (indOrComp == 'i' || indOrComp == 'I') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                taxPayers.add(new Individual(name, anualIncome, healthExpenditures));
            } else if (indOrComp == 'c' || indOrComp == 'C') {
                System.out.print("Number of employees: ");
                int numOfEmp = sc.nextInt();
                taxPayers.add(new Company(name, anualIncome, numOfEmp));
            } else {
                System.out.println("Invalid income tax");
                return;
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        Double allTaxes = 0.0;
        for (TaxPayer taxPayer : taxPayers) {
            Double tax = taxPayer.tax();
            System.out.println(String.format(taxPayer.getName() + ": $ " + "%.2f", taxPayer.tax()));
            allTaxes += tax;
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", allTaxes));
        sc.close();
    }
}
