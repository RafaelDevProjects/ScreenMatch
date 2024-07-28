package screenMatch.models;

import com.google.gson.annotations.SerializedName;
import screenMatch.calculations.Classification;
import screenMatch.exceptions.InvalidConversionYear;

public class Title implements Comparable<Title> {
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

    public Title(TitleOMDb titleOMDb) {
        this.name = titleOMDb.title();
        if (titleOMDb.year().length() > 4) {
            throw new InvalidConversionYear("It was not possible to convert the year with more than 4 characters");
        }
        this.releaseYear = Integer.valueOf(titleOMDb.year());
        this.minutesDuration = Integer.valueOf(titleOMDb.runtime().substring(0,2));
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

    // comparable
    @Override
    public int compareTo(Title o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "(name = " + name + ' ' + ", releaseYear = " + releaseYear + ", Duration = " + minutesDuration + " )";
    }
}
