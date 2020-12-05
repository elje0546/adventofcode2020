import org.junit.jupiter.api.Test;

import java.io.File;
import java.math.BigInteger;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
class DayThreeTest {
    List<String> list = ParseFile.parseFileToArrayString(new File("/Users/elisabeth/IdeaProjects/adeventofcode/src/main/resources/testDay3" ));
     DayThree dayThree = new DayThree(list);

    @Test
    public void testIndexCounter(){
        DayThree dayThree = new DayThree(Collections.EMPTY_LIST);

        DayThree.IndexCounter indexCounter = new DayThree.IndexCounter(11, 3 , 0);
        assertTrue(indexCounter.index() == 3);
        assertTrue(indexCounter.index() == 6);
        assertTrue(indexCounter.index() == 9);
        assertTrue(indexCounter.index() == 0);
        assertTrue(indexCounter.index() == 3);


    }

    @Test
    public void testCharMatch(){
        var list = ParseFile.parseFileToArrayString(new File("/Users/elisabeth/IdeaProjects/adeventofcode/src/main/resources/day3" ));
        var word = list.get(0);
        assertTrue(word.charAt(3) == '#');

    }

    @Test
    public void testAnswer(){
        System.out.println(list.get(0).length());
        assertEquals(dayThree.findSolution(65), BigInteger.valueOf(7));
    }

    @Test
    public void testSecondPart(){
       BigInteger actual = dayThree.findSolution(65, 1, 1)
               .multiply(dayThree.findSolution(65, 3, 1))
               .multiply(dayThree.findSolution(65, 5, 1))
               .multiply(dayThree.findSolution(65, 7, 1))
               .multiply(dayThree.findSolution(65, 1, 2));
        assertEquals(BigInteger.valueOf(336), actual);

    }

}