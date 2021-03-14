package capitulo_17_trabalhando_com_arquivos.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo_02_cap_17_ler_arquivo {
    public static void main(String[] args) {

        String path = "c:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
