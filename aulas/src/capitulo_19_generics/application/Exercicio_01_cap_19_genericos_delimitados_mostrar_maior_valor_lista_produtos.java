package capitulo_19_generics.application;

import capitulo_19_generics.model.entities.Product;
import capitulo_19_generics.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Exercicio_01_cap_19_genericos_delimitados_mostrar_maior_valor_lista_produtos {
    public static void main(String[] args) {


//        Uma empresa de consultoria deseja avaliar a performance de produtos,
//        funcionários, dentre outras coisas. Um dos cálculos que ela precisa é encontrar
//        o maior dentre um conjunto de elementos. Fazer um programa que leia um
//        conjunto de produtos a partir de um arquivo, conforme exemplo, e depois
//        mostre o mais caro deles.

//        Criar um serviço de cálculo:
//        |-------------------------|
//        |    CalculationService   |
//        |-------------------------|
//        |+ max<T>(list: List<T>):T|
//        |-------------------------|

//        Computer, 890.50
//        IPhone X, 910.00
//        Tablet, 550.00
//        Most expensive:
//        IPhone, 910.00

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        String path = "C:\\temp\\inProdutos.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Most expensive:");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
