package screenMatch.models;

import screenMatch.calculations.Classification;

public class Film extends Title implements Classification{
    private String director;

    public Film(String name, int realeseYear) {
        super(name, realeseYear);
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

    @Override
    public int getClassification() {
        return (int )getMedia() / 2;
    }

}
