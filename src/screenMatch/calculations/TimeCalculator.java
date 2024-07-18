package screenMatch.calculations;

import screenMatch.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return this.totalTime;
    }

    public void include(Title t) {
        this.totalTime += t.getMinutesDuration();
    }
}
