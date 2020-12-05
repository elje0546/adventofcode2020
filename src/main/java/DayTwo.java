import java.io.File;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DayTwo {
    File fileDayTwo = new File("/Users/elisabeth/IdeaProjects/adeventofcode/src/main/resources/day2" );
    List<String> dayTwoList = ParseFile.parseFileToArrayString(fileDayTwo);



    long findSolution( ){
        return findSolution(dayTwoList);
    }

    long findSolution(List<String> f) {
        System.out.println("count : " + f.size());
        return f.stream()
                .filter(DayTwo::otherSolution)
                .count();

    }

    long findSecondSolution(){
        return findSecondSolution(dayTwoList);
    }

    long findSecondSolution(List<String> f){
        System.out.println("count : " + f.size());
        return f.stream()
                .filter(DayTwo::secondSolution)
                .count();
    }

    static boolean otherSolution(String word){
        var wordData = new WordData(word);
        char[] chars = wordData.password.toCharArray();
        int numberOfLetters= 0;
        for(char c : chars){
            if(c == wordData.letter){
                numberOfLetters++;
            }

        }
        if(numberOfLetters>= wordData.firstNumber && numberOfLetters<= wordData.secondNumber) {
            return true;
        }else return false;
    }

    static boolean secondSolution(String word){
        WordData data = new WordData(word);
        System.out.println("password " + data.password);
        System.out.println("letter " + data.letter);
        System.out.println("numbers " + data.firstNumber + " , " + data.secondNumber);
        if(word.length()<data.secondNumber){
            return false;
        }
        return data.password.charAt(data.firstNumber-1) == data.letter && !(data.password.charAt(data.secondNumber-1) == data.letter)
        || !(data.password.charAt(data.firstNumber-1) == data.letter) && (data.password.charAt(data.secondNumber-1) == data.letter);
    }

    static boolean parsWord(String word) {
        WordData wordData = new WordData(word);


        String regex = wordData.letter + "\\w{" + wordData.firstNumber + "," + wordData.secondNumber + "}";

        System.out.println("Matches: " +wordData.password.matches(regex));
        System.out.println("password: " + wordData.password);
        System.out.println("regex: " + regex);
        System.out.println("word: " + word);
        System.out.println("letter: " + wordData.letter);
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(wordData.password);
        return matcher.find();
    }

    private static class WordData{
        String word;
        int firstNumber;
        int secondNumber;
        char letter;
        String password;

        WordData(String word){
            this.word = word;
            int endIndex = word.indexOf(' ');
            String numbers = word.substring(0, endIndex);
            int subtractSign = numbers.indexOf('-');
            firstNumber = Integer.parseInt(numbers.substring(0 ,subtractSign));
            secondNumber = Integer.parseInt(numbers.substring(subtractSign +1, endIndex));
            letter = word.charAt(endIndex + 1);
            int passwordBegin = word.indexOf(':') + 2;
            password = word.substring(passwordBegin);

        }
    }
}
