package capitulo_13_enumeracoes_composicoes.application;

import capitulo_13_enumeracoes_composicoes.entities.Comment;
import capitulo_13_enumeracoes_composicoes.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Exercicio_02_cap_13 {
    public static void main(String[] args) throws ParseException {

//        Instancie manualmente (hard code) os objetos mostrados abaixo e mostre-os
//        na tela do terminal, conforme exemplo.
//
//      |------------------------|
//      |         Post           |
//      |------------------------|               |------------------------|
//      | - moment : Date        |   -comments   |        Comment         |
//      | - title : String       |-------------> |------------------------|
//      | - content : String     |           *   | - text : String        |
//      | - likes : integer      |               |------------------------|
//      |------------------------|
//
//
//                                                                          |------------------------|
//      |------------------------------------------------------|            |       :Comment         |
//      |                      :Post                           |------------|------------------------|
//      |------------------------------------------------------|            | text = Have a nice trip|
//      | moment = 21/06/2018 13:05:44                         |            |------------------------|
//      | title = Traveling to New Zeland                      |
//      | content = I`m going to visit this wonderful country! |            |----------------------------|
//      | likes = 12                                           |------------|          :Comment          |
//      |------------------------------------------------------|            |----------------------------|
//                                                                          | text = Wow that's awesomse!|
//                                                                          |----------------------------|
//
//                                                   |-------------------|
//      |-------------------------------|            |     :Comment      |
//      |           :Post               |------------|-------------------|
//      |-------------------------------|            | text = Good Night |
//      | moment = 28/07/2018 23:14:19  |            |-------------------|
//      | title = Good night guys       |
//      | content = See you tomorrow    |            |----------------------------------|
//      | likes = 5                     |------------|             :Comment             |
//      |-------------------------------|            |----------------------------------|
//                                                   | text = May the Force be with you |
//                                                   |----------------------------------|
//
//        Traveling to New Zealand
//        12 Likes - 21/06/2018 13:05:44
//        I'm going to visit this wonderful country!
//        Comments:
//        Have a nice trip
//        Wow that's awesome!
//        Good night guys
//        5 Likes - 28/07/2018 23:14:19
//        See you tomorrow
//        Comments:
//        Good night
//        May the Force be with you

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");
        Post p1 = new Post(
                sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!",
                12);
        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");
        Post p2 = new Post(
                sdf.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}