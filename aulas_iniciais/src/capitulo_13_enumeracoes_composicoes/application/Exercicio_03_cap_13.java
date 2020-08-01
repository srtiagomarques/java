package capitulo_13_enumeracoes_composicoes.application;

import capitulo_13_enumeracoes_composicoes.entities.*;
import capitulo_13_enumeracoes_composicoes.entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03_cap_13 {
    public static void main(String[] args) throws ParseException {

//        Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
//        sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
//        o instante do sistema: new Date()

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Order order = new Order();
        OrderItem orderItem = new OrderItem();
        Product product = new Product();

        System.out.println("Enter client data");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(sc.next());
        System.out.println();
        order = new Order(new Date(), orderStatus, client);
        System.out.print("How many items to this order? ");
        int items = sc.nextInt();
        for (int i = 0; i < items; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            product = new Product(productName, productPrice);
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            orderItem = new OrderItem(quantity, productPrice, new Product(productName, productPrice));
            order.addItem(orderItem);
        }
        System.out.println();
        System.out.println("Order summary:");
        System.out.println(order);
        sc.close();
    }
}
