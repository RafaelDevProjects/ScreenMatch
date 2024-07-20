package screenMatch.main;

import screenMatch.models.Film;
import screenMatch.models.Serie;
import screenMatch.models.Title;

import java.util.ArrayList;

public class MainList {
    public static void main(String[] args) {
        Film film = new Film("Star Wars", 1970);
        film.setAssessment(9);
        Film film3= new Film("Dogville", 2003);
        film3.setAssessment(6);
        Film film2 = new Film("Jurassic Word", 1990);
        film2.setAssessment(10);

        Serie serie = new Serie("Lost",2000);

        ArrayList<Title> titlesList = new ArrayList<>();
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


    }
}
