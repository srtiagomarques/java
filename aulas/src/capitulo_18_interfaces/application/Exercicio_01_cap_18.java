package capitulo_18_interfaces.application;

import capitulo_18_interfaces.model.entities.Contract;
import capitulo_18_interfaces.model.entities.Installment;
import capitulo_18_interfaces.model.services.ContractService;
import capitulo_18_interfaces.model.services.PaypalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01_cap_18 {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data:");
        System.out.println("Number: ");
        Integer number = sc.nextInt();
        System.out.println("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.println("Contract value: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number, date, totalValue);

        System.out.println("Enter number of installments: ");
        Integer numberInstallments = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());

        contractService.processContract(contract, numberInstallments);

        System.out.println("Installments:");
        for (Installment x : contract.getInstallments()) {
            System.out.println(x);
        }

        sc.close();
    }
}
