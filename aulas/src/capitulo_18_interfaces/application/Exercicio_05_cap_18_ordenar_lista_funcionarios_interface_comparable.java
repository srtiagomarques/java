package capitulo_18_interfaces.application;

import capitulo_18_interfaces.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio_05_cap_18_ordenar_lista_funcionarios_interface_comparable {
    public static void main(String[] args) {

//        Faça um programa para ler um arquivo contendo funcionários (nome e salário) no
//        formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar
//        o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".
//                Maria Brown,4300.00
//        Alex Green,3100.00
//        Bob Grey,3100.00
//        Anna White,3500.00
//        Alex Black,2450.00
//        Eduardo Rose,4390.00
//        Willian Red,2900.00
//        Marta Blue,6100.00
//        Alex Brown,5000.00

        List<Employee> list = new ArrayList<>();
        String path = "C:\\temp\\inEmp.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
