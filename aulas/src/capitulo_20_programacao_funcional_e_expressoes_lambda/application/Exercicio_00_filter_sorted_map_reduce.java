package capitulo_20_programacao_funcional_e_expressoes_lambda.application;

import capitulo_20_programacao_funcional_e_expressoes_lambda.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Exercicio_00_filter_sorted_map_reduce {
    public static void main(String[] args) {

//        Fazer um programa para ler um conjunto de produtos a partir de um
//        arquivo em formato .csv (suponha que exista pelo menos um produto).
//                Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
//        nomes, em ordem decrescente, dos produtos que possuem preço
//        inferior ao preço médio.
//        Veja exemplo na próxima página.

//        Input file:
//        Tv,900.00
//        Mouse,50.00
//        Tablet,350.50
//        HD Case,80.90
//        Computer,850.00
//        Monitor,290.00

//        Execution:
//        Enter full file path: c:\temp\inProduos2.txt
//        Average price: 420.23
//        Tablet
//        Mouse
//        Monitor
//        HD Case

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x + y) / list.size();

            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

            List<String> names = list.stream()
//                    Filtro por valores menores que a média
                    .filter(p -> p.getPrice() < avg)
//                    Pegar o nome de cada produto que foi filtrado
                    .map(p -> p.getName())
//                    Ordenar a lista na order alfabética decrescente (reversa)
                    .sorted(comp.reversed())
//                    Converter a stream em uma lista
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}
