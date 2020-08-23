package capitulo_15_tratamento_de_excecoes.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import capitulo_15_tratamento_de_excecoes.model.entities.Reservation;
import capitulo_15_tratamento_de_excecoes.model.exceptions.DomainException;

public class Exercicio_00_cap_15 {
    public static void main(String[] args) {

//        Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data
//        de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em
//        dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
//        novamente a reserva com os dados atualizados. O programa não deve aceitar dados
//        inválidos para a reserva, conforme as seguintes regras:
//        - Alterações de reserva só podem ocorrer para datas futuras
//        - A data de saída deve ser maior que a data de entrada
//
//                    |-----------------------------------------------------|
//                    |                      Reservation                    |
//                    |-----------------------------------------------------|
//                    | - roomNumber : Integer                              |
//                    | - checkin : Date                                    |
//                    | - checkout : Date                                   |
//                    |-----------------------------------------------------|
//                    | + duration() : Integer                              |
//                    | + updateDates( checkin: Date, checkout: Date): void |
//                    |-----------------------------------------------------|

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int number = sc.nextInt();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(number, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation:");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch (ParseException e) {
            System.out.println("Invalid date format");
        }
        catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}