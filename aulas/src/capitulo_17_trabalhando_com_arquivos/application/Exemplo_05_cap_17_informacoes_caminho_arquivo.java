package capitulo_17_trabalhando_com_arquivos.application;

import java.io.File;
import java.util.Scanner;

public class Exemplo_05_cap_17_informacoes_caminho_arquivo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

//        Pegar o nome do arquivo
        System.out.println("getName: " + path.getName());
//        Pegar o caminho do arquivo
        System.out.println("getParent: " + path.getParent());
//        Pegar o caminho e nome do arquivo
        System.out.println("getPath: " + path.getPath());

        sc.close();
    }
}
