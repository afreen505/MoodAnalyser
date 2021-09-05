package moodanalyser;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
        super();
    }

    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        if (message.contains("sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}