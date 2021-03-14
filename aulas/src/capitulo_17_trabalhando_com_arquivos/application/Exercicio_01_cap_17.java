package capitulo_17_trabalhando_com_arquivos.application;

import capitulo_17_trabalhando_com_arquivos.entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.*;

public class Exercicio_01_cap_17 {
    public static void main(String[] args) throws ParseException {

//        Fazer um programa para ler o caminho de um arquivo .csv
//        contendo os dados de itens vendidos. Cada item possui um
//        nome, preço unitário e quantidade, separados por vírgula. Você
//        deve gerar um novo arquivo chamado "summary.csv", localizado
//        em uma subpasta chamada "out" a partir da pasta original do
//        arquivo de origem, contendo apenas o nome e o valor total para
//        aquele item (preço unitário multiplicado pela quantidade),
//        conforme exemplo.

//        Source file:                        Output file (out/summary.csv)
//
//        |-------------------------|        |------------------------|
//        |TV LED,1290.99,1         |        |TV LED,1290.99          |
//        |Video Game Chair,350.50,3|        |Video Game Chair,1051.50|
//        |Iphone X,900.00,2        |        |Iphone X,1800.00        |
//        |Samsung Galaxy 9,850.00,2|        |Samsung Galaxy 9,1700.00|
//        |-------------------------|        |------------------------|

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Ler caminho do csv
        System.out.println("Enter the full file path: ");
        String strFullPath = sc.nextLine();

        List<Product> list = new ArrayList<>();

//        A partir do caminho do csv criar uma pasta chamada out
        File path = new File(strFullPath);
        new File(path.getParent() + "\\out").mkdir();
        String out = "c:\\temp\\out\\summary.csv";

//        Ler o arquivo csv
        try (BufferedReader br = new BufferedReader(new FileReader(strFullPath))) {

            String itemCsv = br.readLine();
//            List<String> lines = new ArrayList<>();

            while (itemCsv != null) {
                System.out.println(itemCsv);
                String[] fields = itemCsv.split(";");
                System.out.println("Elements: " + fields);
                String name = fields[0];
                Double price = Double.valueOf(fields[1]);
                Integer quantty = Integer.valueOf(fields[2]);
                list.add(new Product(name, price, quantty));
                itemCsv = br.readLine();
            }
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(out, true))) {
                for (Product item : list) {
                    bw.write(item.getName() + ";" + String.format("%.2f", item.total()));
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        sc.close();
    }
}
