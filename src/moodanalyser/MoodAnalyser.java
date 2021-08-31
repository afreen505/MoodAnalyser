package moodanalyser;

public class MoodAnalyser {
    public String message;

    /**
     * analyseMood is a method to check if sad message then return sad .
     * if happy message then return happy
     */
    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        return "HAPPY";
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    /**
     * Default constructor
     */
    public MoodAnalyser() {
        this.message = message;
    }

    /**
     * exceptionAnalyseMood is a function check if message contain sad then return sad.
     * if contain happy then return happy if contain null then also return happy
     */
    public String exceptionAnalyseMood() {
        try {
            if (message.contains("sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}