package moodanalyser;

public class MoodAnalysisException extends Exception {
    enum expectedType {
        Null_EXCEPTION, EMPTY_EXCEPTION;
    }

    expectedType type;

    public MoodAnalysisException(expectedType type, String message) {
        super(message);
        this.type = type;
    }

}

