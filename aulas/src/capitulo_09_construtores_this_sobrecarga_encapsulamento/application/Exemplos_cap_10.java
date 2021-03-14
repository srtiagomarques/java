package capitulo_09_construtores_this_sobrecarga_encapsulamento.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplos_cap_10 {
    public static void main(String[] args) {
        System.out.println("Exemplo de laço com foreach:");
//        Criação do meu vetor com três posições
        String[] vect = new String[]{"Maria", "João", "Cleiton"};
//        A leitura do foreach é vista assim:
//        Para cada objetejo obj contido no vetor vect faça
        for (String obj : vect) {
            System.out.println(obj);
        }
        System.out.println("-------------------------------------");
        System.out.println("Exemplo de manipulação de lista:");
//        Criação da lista
        List<String> listaDeNomes = new ArrayList<>();
//        Adicionando elementos na lista
        listaDeNomes.add("Maria");
        listaDeNomes.add("João");
        listaDeNomes.add("José");
        listaDeNomes.add("Jairo");
        listaDeNomes.add("Cleiton");
        listaDeNomes.add(2, "Marco");
//        Informa o tamanho da lista
        System.out.println("Tamanho inicial da lista: " + listaDeNomes.size());
//        Remove um elemento da lista pelo seu valor
        listaDeNomes.remove("Maria");
//        Remove um elemento da lista pela sua posição
        listaDeNomes.remove(0);
//        Remove um elemento da lista através de um predicado
        listaDeNomes.removeIf(nome -> nome.charAt(0) == 'M');
//        Encontrar a posição de um elemento
        System.out.println("Index of Cleiton: " + listaDeNomes.indexOf("Cleiton"));
//        Quando não encontra o elemento da lista retorna -1
        System.out.println("Index of Maria: " + listaDeNomes.indexOf("Maria"));
//        Percorre a lista e mostra os elementos dela
        for (String nome : listaDeNomes) {
            System.out.println(nome);
        }
//         Filtra a lista, e monta uma outra lista somente com as informações que eu solicitei
        List<String> listaFiltrada = listaDeNomes
                .stream().filter(nome -> nome.charAt(0) == 'J').collect(Collectors.toList());
        for (String nome : listaFiltrada) {
            System.out.println("Nome da lista filtrada: " + nome);
        }
//        Retornar o primeiro registro encontrado
        String name = listaDeNomes.stream().filter(nome -> nome.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println("Primeiro nome encontrado que tem como primeira letra J: " + name);
    }
}
