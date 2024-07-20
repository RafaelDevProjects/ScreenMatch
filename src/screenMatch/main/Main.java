package screenMatch.main;

import screenMatch.calculations.RecomendationFilter;
import screenMatch.models.Episode;
import screenMatch.models.Film;
import screenMatch.models.Serie;
import screenMatch.calculations.TimeCalculator;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // films
        Film film = new Film("Star Wars", 1970);
        film.setMinutesDuration(200);
        film.setAssessment(5);
        film.setAssessment(5);
        film.setAssessment(5);
        film.setAssessment(5);

        film.getDataSheet();
        System.out.println("Total assessment: " + film.getTotalAssessment());
        System.out.println(film.getMedia());

        Film film2 = new Film("Jurassic Word", 1990);
        film2.setMinutesDuration(180);
        film2.setAssessment(10);
        film2.setAssessment(10);
        film2.setAssessment(10);

        // series
        Serie serie = new Serie("Lost",2000);
        serie.setActive(true);
        serie.setMinutesDuration(100);
        serie.setSeasons(1);
        serie.setAssessment(1);
        serie.setAssessment(1);
        serie.setMinutesPerEpisodes(50);
        serie.setEpisodesPerSeasons(5);
        serie.getDataSheet();
        System.out.println("Total assessment: " + serie.getTotalAssessment());
        System.out.println(serie.getMedia());
        System.out.println("Duração da Serie: " + serie.getMinutesDuration());

        // timeCalculator
        TimeCalculator timeCalculator = new TimeCalculator();
        timeCalculator.include(film);
        timeCalculator.include(film2);
        timeCalculator.include(serie);
        System.out.println("Total Time: " + timeCalculator.getTotalTime());

        RecomendationFilter recomendationFilter = new RecomendationFilter();
        recomendationFilter.filter(film2);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setSerie(serie);
        episode.setTotalViews(100);
        recomendationFilter.filter(episode);

        Film film3= new Film("Dogville", 2003);
        film3.setMinutesDuration(200);
        film3.setAssessment(10);

        ArrayList<Film> films = new ArrayList<>();
        films.add(film3);
        films.add(film2);
        films.add(film);
        System.out.println("list size: " + films.size());
        System.out.println("Film1: " + films.get(0).getName());
        System.out.println(films);

    }
}
