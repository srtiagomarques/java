package capitulo_13_enumeracoes_composicoes.application;

import capitulo_13_enumeracoes_composicoes.entities.Department;
import capitulo_13_enumeracoes_composicoes.entities.HourContract;
import capitulo_13_enumeracoes_composicoes.entities.Worker;
import capitulo_13_enumeracoes_composicoes.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01_cap_13 {
    public static void main(String[] args) throws ParseException {

//        Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
//        do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo

//      |----------------------------------------------------|      |------------------------|
//      |     Worker                                         |      | HourContract           |
//      |----------------------------------------------------|      |------------------------|
//      |  - name: String                                    |      | - date : Date          |
//      |  - level: WorkerLevel                              |----->| - valuePerHour : Double|
//      |  - bseSalary: Double                               |    * | - hours : Integer      |
//      |----------------------------------------------------|      |------------------------|
//      |  + addContract(contract: HourContract) : void      |      | + totalValue() : Double|
//      |  + removeContract(contract: HourCOntract) : void   |      |------------------------|
//      |  + income(year : integer, month : integer) : Double|
//      |----------------------------------------------------|
//                              |                                   |-------------------|
//                            1 | - department                      |     <<enum>>      |
//                             \|/                                  |    WorkerLevel    |
//                      |-----------------|                         |-------------------|
//                      |  Department     |                         | - JUNIOR : int    |
//                      |-----------------|                         | - MID_LEVEL : int |
//                      | - name : String |                         | - SENIOR : int    |
//                      |-----------------|                         |-------------------|
//
//        Enter department's name: Design
//        Enter worker data:
//        Name: Alex
//        Level: MID_LEVEL
//        Base salary: 1200.00
//        How many contracts to this worker? 3
//        Enter contract #1 data:
//        Date (DD/MM/YYYY): 20/08/2018
//        Value per hour: 50.00
//        Duration (hours): 20
//        Enter contract #2 data:
//        Date (DD/MM/YYYY): 13/06/2018
//        Value per hour: 30.00
//        Duration (hours): 18
//        Enter contract #3 data:
//        Date (DD/MM/YYYY): 25/08/2018
//        Value per hour: 80.00
//        Duration (hours): 10
//        Enter month and year to calculate income (MM/YYYY): 08/2018
//        Name: Alex
//        Department: Design
//        Income for 08/2018: 3000.00

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}