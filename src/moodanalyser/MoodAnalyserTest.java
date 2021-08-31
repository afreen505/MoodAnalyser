package moodanalyser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoodAnalyserTest {

    MoodAnalyser moodanalyser = null;

    @Before
    public void seUp() {
        moodanalyser = new MoodAnalyser();
    }

    @Test
    public void givenMessageIsSadMood_shouldReturn_Sad() {
        String mood = moodanalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessageIsAny_shouldReturn_Happy() {
        String mood = moodanalyser.analyseMood("I am in Happy mood");
        Assert.assertEquals("HAPPPY!!!", mood);
    }

}
