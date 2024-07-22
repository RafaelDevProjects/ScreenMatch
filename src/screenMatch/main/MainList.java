package screenMatch.main;

import screenMatch.models.Film;
import screenMatch.models.Serie;
import screenMatch.models.Title;

import java.util.*;

public class MainList {
    public static void main(String[] args) {
        Film film = new Film("Star Wars", 1970);
        film.setAssessment(9);
        Film film3= new Film("Dogville", 2003);
        film3.setAssessment(6);
        Film film2 = new Film("Jurassic Word", 1990);
        film2.setAssessment(10);

        Serie serie = new Serie("Lost",2000);

        List<Title> titlesList = new LinkedList<>();
        titlesList.add(film3);
        titlesList.add(film2);
        titlesList.add(film);
        titlesList.add(serie);
        for (Title item : titlesList) {
            System.out.println(item.getName());
            if (item instanceof Film filme) {
                System.out.println("| Classification: " + filme.getClassification());
            }
        }

        Collections.sort(titlesList); // implementa o Comparable e usa o compareTo para ordenar essa lista de titles.
        System.out.println("Ordenado por ordem alfabetica: " + titlesList);

        // compara pelo ano de lançamento
        titlesList.sort(Comparator.comparing(Title::getReleaseYear)); // usando o metodo sort e usando o metodo do Comparator chamado comparing que tem outro argumento que escolhe oque vamos comparar da nossa classe.
        System.out.println("Ordenado por ano de lançamento: " + titlesList);

    }
}
