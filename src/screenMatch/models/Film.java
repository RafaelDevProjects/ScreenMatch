package screenMatch.models;

import screenMatch.calculations.Classification;

public class Film extends Title{
    private String director;

    public Film(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString(){
        return "Film: " + this.name + "( " + this.releaseYear + " )";
    }

}
