package screenMatch.models;

public class Serie extends Title {
    private int seasons;
    private int episodesPerSeasons;
    private boolean active;
    private int minutesPerEpisodes;

    public Serie(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public int getEpisodesPerSeasons() {
        return episodesPerSeasons;
    }

    public boolean isActive() {
        return active;
    }

    public int getMinutesPerEpisodes() {
        return minutesPerEpisodes;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public void setEpisodesPerSeasons(int episodesPerSeasons) {
        this.episodesPerSeasons = episodesPerSeasons;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setMinutesPerEpisodes(int minutesPerEpisodes) {
        this.minutesPerEpisodes = minutesPerEpisodes;
    }

    @Override
    public int getMinutesDuration() {
        return seasons * episodesPerSeasons * minutesPerEpisodes;
    }

    @Override
    public String toString(){
        return "Serie: " + this.name + "( " + this.releaseYear + " )";
    }
}
