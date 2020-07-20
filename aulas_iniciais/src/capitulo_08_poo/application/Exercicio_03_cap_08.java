package capitulo_08_poo.application;

import capitulo_08_poo.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_03_cap_08 {
    public static void main(String[] args) {

//      Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
//      (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
//      ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
//      para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
//      resolver este problema.

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Enter the student's name:");
        student.name = sc.nextLine();
        System.out.println("Insert student's first grade");
        student.grade01 = sc.nextDouble();
        System.out.println("Insert the student's second note");
        student.grade02 = sc.nextDouble();
        System.out.println("Insert the student's third grade");
        student.grade03 = sc.nextDouble();
        System.out.println();
        System.out.printf("Final grade = %.2f.%n", student.finalGrade());
        if (student.finalGrade() >= 60) {
            System.out.println("Pass :)");
        } else {
            System.out.println("Failed :(");
            System.out.println("Missing " + student.missingPoints() + " points.");
        }
        sc.close();
    }
}
