import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DayOneTest {
    File fileDayOne = new File("/Users/elisabeth/IdeaProjects/adeventofcode/src/main/resources/day1" );
    DayOne dayOne = new DayOne();
    List<Integer> list = ParseFile.parseFileToArray(fileDayOne);
    @Test
    void testSecondSolution(){


    }

}