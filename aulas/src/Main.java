import java.util.Locale;

public class Main {
    public static void main(String[] args) {
//        Mostrar informações em tela
        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        System.out.println("Java Rocks!");
//        Configuração de lcalização
        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
//        Concatenação
//        %f = ponto flutuante, %d = inteiro, %s = texto, %n = quebra de linha
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado = %.2f metros%n", x);
        String nome = "Maria";
        int idade = 31;
        double renda = 4000.00;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais.%n", nome, idade, renda);
//        Exercício 01
        String product1 = "Computer";
        String product2 = "Office Desk";
        int age = 30;
        int code = 5290;
        char gender = 'F';
        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;
        System.out.println("Products:");
        System.out.printf("%s, whitch price is $ %.2f.%n", product1, price1);
        System.out.printf("%s, whitch price is $ %.2f.%n%n", product2, price2);
        System.out.printf("Record: %d years old, code %d and gender: %s.%n%n", age, code, gender);
        System.out.printf("Measure with eight decimal places: %.8f.%n", measure);
        System.out.printf("Rouded (three decimal places): %.3f.%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US Decimal point: %.3f.%n", measure);

    }
}
