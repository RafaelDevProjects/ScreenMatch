package screenMatch.calculations;

import screenMatch.models.Title;

public class RecomendationFilter {
    public void filter(Classification classification){
        if (classification.getClassification() >= 4){
            System.out.println("is among the recommended films");
        } else if (classification.getClassification() >= 2) {
            System.out.println("This film have a good recomendaition");
        } else {
            System.out.println("Put on your list for wacth later");
        }
    }
}
