import screenMatch.calculations.RecomendationFilter;
import screenMatch.models.Episode;
import screenMatch.models.Film;
import screenMatch.models.Serie;
import screenMatch.calculations.TimeCalculator;

public class Main {
    public static void main(String[] args) {

        // films
        Film film = new Film();
        film.setName("Star Wars");
        film.setMinutesDuration(200);
        film.setReleaseYear(1970);
        film.setAssessment(5);
        film.setAssessment(5);
        film.setAssessment(5);
        film.setAssessment(5);

        film.getDataSheet();
        System.out.println("Total assessment: " + film.getTotalAssessment());
        System.out.println(film.getMedia());

        Film film2 = new Film();
        film2.setName("Jurassic Word");
        film2.setMinutesDuration(180);
        film2.setReleaseYear(1990);
        film2.setAssessment(10);
        film2.setAssessment(10);
        film2.setAssessment(10);

        // series
        Serie serie = new Serie();
        serie.setName("Lost");
        serie.setActive(true);
        serie.setMinutesDuration(100);
        serie.setReleaseYear(2022);
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

        recomendationFilter.filter(serie);


    }
}
