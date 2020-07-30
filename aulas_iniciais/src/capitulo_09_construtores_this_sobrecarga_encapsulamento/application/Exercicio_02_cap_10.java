package capitulo_09_construtores_this_sobrecarga_encapsulamento.application;

import capitulo_09_construtores_this_sobrecarga_encapsulamento.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercicio_02_cap_10 {
    public static void main(String[] args) {
//        Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
//        N funcionários. Não deve haver repetição de id.

//        Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
//        Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
//        mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
//        conforme exemplos.

//        Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
//        ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
//        aumento por porcentagem dada.

//        EX: 01

//        How many employees will be registered? 3
//        Emplyoee #1:
//        Id: 333
//        Name: Maria Brown
//        Salary: 4000.00
//        Emplyoee #2:
//        Id: 536
//        Name: Alex Grey
//        Salary: 3000.00
//        Emplyoee #3:
//        Id: 772
//        Name: Bob Green
//        Salary: 5000.00
//        Enter the employee id that will have salary increase : 536
//        Enter the percentage: 10.0
//        List of employees:
//        333, Maria Brown, 4000.00
//        536, Alex Grey, 3300.00
//        772, Bob Green, 5000.00

//        EX: 02

//        How many employees will be registered? 2
//        Emplyoee #1:
//        Id: 333
//        Name: Maria Brown
//        Salary: 4000.00
//        Employee #2:
//        Id: 536
//        Name: Alex Grey
//        Salary: 3000.00
//        Enter the employee id that will have salary increase: 776
//        This id does not exist!
//                List of employees:
//        333, Maria Brown, 4000.00
//        536, Alex Grey, 3000.00

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> listOfEmployees = new ArrayList<>();
        System.out.println("How many employees will be registered?");
        int numberOfEmployees = sc.nextInt();
        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            while (getEmployeeById(listOfEmployees, id)) {
                System.out.print("Id already taken. Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            listOfEmployees.add(new Employee(id, name, salary));
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        Employee employee = null;
        int employeeId;
        do {
            employeeId = sc.nextInt();
            int finalEmployeeId = employeeId;
            employee = listOfEmployees.stream().filter(id -> id.getId() == finalEmployeeId).findFirst().orElse(null);
            if (employee == null) {
                System.out.println("This id does not exist!");
                System.out.print("Please insert a valid id: ");
            } else {
                System.out.print("Enter the percentage: ");
                double percentage = sc.nextDouble();
                employee.increaseSalary(percentage);
            }
        }
        while (employee == null);

        System.out.println("List of employees:");
        for (Employee employeeData : listOfEmployees) {
            System.out.println(employeeData);
        }
        sc.close();
    }

    public static boolean getEmployeeById(List<Employee> employeeList, int id) {
        Employee employee = employeeList.stream().filter(currentoEmployee -> currentoEmployee.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
