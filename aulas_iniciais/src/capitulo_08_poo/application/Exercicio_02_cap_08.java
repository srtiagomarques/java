package capitulo_08_poo.application;

import capitulo_08_poo.entities.Employee;

import javax.swing.plaf.IconUIResource;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_02_cap_08 {
    public static void main(String[] args) {

//      Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
//      seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
//      salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
//      afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
//      projetada abaixo.

//      Employee
//      -----------------------------------------
//      - Name : string
//      - GrossSalary : double
//      - Tax : double
//      -----------------------------------------
//      + NetSalary() : double
//      + IncreaseSalary(percent : double) : void

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.println("Enter the employee's name:");
        employee.name = sc.nextLine();
        System.out.println("Enter the employee's gross salary:");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Enter employee tax:");
        employee.tax = sc.nextDouble();
        System.out.println();
        System.out.println("Employee: " + employee);
        System.out.println();
        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println();
        System.out.println("Updated data: " + employee);

        sc.close();
    }
}
