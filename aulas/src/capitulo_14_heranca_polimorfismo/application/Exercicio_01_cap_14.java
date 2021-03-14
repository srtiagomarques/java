package capitulo_14_heranca_polimorfismo.application;

import capitulo_14_heranca_polimorfismo.entities.Employee;
import capitulo_14_heranca_polimorfismo.entities.ImportedProduct;
import capitulo_14_heranca_polimorfismo.entities.Product;
import capitulo_14_heranca_polimorfismo.entities.UsedProduct;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Exercicio_01_cap_14 {
    public static void main(String[] args) throws ParseException {

//        Fazer um programa para ler os dados de N
//        produtos (N fornecido pelo usuário). Ao final,
//        mostrar a etiqueta de preço de cada produto na
//        mesma ordem em que foram digitados.
//        Todos os produtos possuem nome e preço. Produtos
//        importados possuem uma taxa de alfândega, e
//        produtos usados possuem data de fabricação.
//        Estes dados específicos devem ser
//        acrescentados na etiqueta de preço conforme
//        exemplo (próxima página). Para produtos
//        importados, a taxa e alfândega deve ser
//        acrescentada ao preço final do produto.
//                Favor implementar o programa conforme
//        projeto abaixo.
//
//
//                    |------------------------|
//                    |        Product         |
//                    |------------------------|
//                    | - name : String        |
//                    | - price : Double       |
//                    |------------------------|
//                    | + priceTag() : String  |
//                    |------------------------|
//                               /_\
//                                |
//              ----------------------------------------------
//              |                                            |
//              |                                            |
//   |--------------------------|                |--------------------------|
//   |     ImportedProduct      |                |        UsedProduct       |
//   |--------------------------|                |--------------------------|
//   | - customsFee : Double    |                | - manufactureDate : Date |
//   |--------------------------|                |--------------------------|
//   | + priceTag() : String    |                | + priceTag() : String    |
//   | + totalPrice() : Double  |                |--------------------------|
//   |--------------------------|

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();
        System.out.println();
        for (int i = 0; i < numberOfProducts; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)?");
            char productStatus = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            Double price = sc.nextDouble();
            if (productStatus == 'i' || productStatus == 'I') {
                System.out.print("Customs fee:");
                Double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            } else if (productStatus == 'c' || productStatus == 'C') {
                products.add(new Product(name, price));
            } else if (productStatus == 'u' || productStatus == 'U') {
//                Date date = sdf.parse(sc.next());
//                list.add(new UsedProduct(name, price, date));

                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String manufactureDate = sc.next();
                DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                Date dt = df.parse(manufactureDate);
                products.add(new UsedProduct(name, price, dt));
            } else {
                System.out.println("Invalid status product");
                return;
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        sc.close();

    }
}
