import java.io.File;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayFour {
    List<String> words = ParseFile.parseFileToStringForEveryNewLine(new File("/Users/elisabeth/IdeaProjects/adeventofcode/src/main/resources/dayFour"));


    int findSolution(){
        words.stream().filter(DayFour::regExForCID);



    return 0;
    }


        static boolean regExForCID(String word){
        Pattern pattern = Pattern.compile("cid:.*^");
            Matcher matcher = pattern.matcher(word);
            return matcher.matches();
        }
/*
    byr (Birth Year)
    iyr (Issue Year)
    eyr (Expiration Year)
    hgt (Height)
    hcl (Hair Color)
    ecl (Eye Color)
    pid (Passport ID)
    cid (Country ID)*/
}
