package capitulo_10_comportamento_de_memoria_arrays_listas.application;

import capitulo_10_comportamento_de_memoria_arrays_listas.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_01_cap_10 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many rooms will be rented");
        int n = sc.nextInt();
        Rent[] rents = new Rent[10];

        for (int i = 0; i < n; i++) {
            System.out.println("Insert the client name");
            sc.nextLine();
            String clientName = sc.nextLine();
            System.out.println("Insert the client email");
            String clientEmail = sc.nextLine();
            System.out.println("Insert room for rent");
            int room = sc.nextInt();
            rents[i] = new Rent(i, clientName, clientEmail, room);
        }
        System.out.println("");
        System.out.println("Busy rooms:");
        for (int i = 0; i < 10; i++) {
            if(rents[i] != null){
                System.out.println(i + ": " + rents[i]);
            }
        }
        sc.close();
    }
}
