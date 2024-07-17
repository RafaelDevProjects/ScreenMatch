package entities.ScreenMatch;

public class Film {
    public String name;
    public int releaseYear;
    public boolean planIncluded;
    private double assessmentSum;
    private int totalAssessment;
    public int minutesDuration;

    public Film(String name){
        this.name = name;
    }

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

    public double getMedia(){
        return assessmentSum / totalAssessment;
    }

    @Override
    public String toString() {
        return "Nome: " + name;
    }
}
