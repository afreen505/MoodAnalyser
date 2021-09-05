package moodanalyser;

public class MoodAnalyser {
    private String message;
    public MoodAnalyser(String message) {
        this.message = message;
    }


    /**
     * If message is sad it returns SAD else if message is empty it throws custom exception "EMPTY_EXCEPTION"
     * Else it returns HAPPY
     * @return mood
     * @throws MoodAnalysisException
     */
    public String analyseMood() throws MoodAnalysisException {
        try {
            if(message.isEmpty()) {
                throw new MoodAnalysisException(MoodAnalysisException.expectedType.EMPTY_EXCEPTION, "Please enter a proper message");
            }
            else if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException(MoodAnalysisException.expectedType.Null_EXCEPTION, "Please enter a proper message");
        }
    }
}