import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DayTwoTest {

    @Test
    void tesRegEx(){
        String word = "qmpgmmsmmmmkmmkj";
        String regex = "[m]{7,9}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);

        assertTrue(matcher.find());

    }

    @Test
    void tesRegExFalse(){
        String word = "nhnnwj";
        String regex = "n{5,6}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(word);

        assertFalse(matcher.find());

    }

}