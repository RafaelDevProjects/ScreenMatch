package screenMatch.models;

import screenMatch.calculations.Classification;

public class Episode implements Classification {
    private int number;
    private  String name;
    private Serie serie;

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    private int totalViews;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClassification() {
        if (totalViews > 100){
            return 4;
        } else {
            return 2;
        }
    }

}
