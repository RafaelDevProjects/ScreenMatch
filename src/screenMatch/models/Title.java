package screenMatch.models;

import screenMatch.calculations.Classification;

public class Title {
    protected String name;
    protected int releaseYear;
    protected boolean planIncluded;
    protected double assessmentSum;
    protected int totalAssessment;
    protected int minutesDuration;

    //constructor
    public Title(String name, int releaseYear) {
        this.name = name;
        this.releaseYear = releaseYear;
    }

    //setters
    public void setMinutesDuration(int minutesDuration) {
        this.minutesDuration = minutesDuration;
    }

    public void setPlanIncluded(boolean planIncluded) {
        this.planIncluded = planIncluded;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    // getters
    public int getTotalAssessment(){
        return totalAssessment;
    }

    public void getDataSheet(){
        System.out.println("Name: " +this.name);
        System.out.println("Relase year: " + this.releaseYear);
    }

    public void setAssessment(double assessmentSum) {
        this.assessmentSum += assessmentSum;
        totalAssessment ++;
    }

    public int getMinutesDuration() {
        return minutesDuration;
    }

    public double getMedia(){
        return assessmentSum / totalAssessment;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isPlanIncluded() {
        return planIncluded;
    }
}
