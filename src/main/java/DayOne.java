import java.io.File;
import java.util.List;

public class DayOne {

    File fileDayOne = new File("/Users/elisabeth/IdeaProjects/adeventofcode/src/main/resources/day1" );
    List<Integer> numbers = ParseFile.parseFileToArray(fileDayOne);

    public int dayOneFindSolution() {
        numbers.sort(Integer::compareTo);
        int one;
        for (int i = 0 ; i<numbers.size(); i++){
            one = numbers.get(i);
            for(int j = numbers.size()-1 ; j>0 ; j--){
                int two = numbers.get(j);
                if(two + one < 2020){
                    j = 0;
                }else if(one +  numbers.get(j) == 2020){
                    System.out.println("one: " + one + " Two: " + two);
                    return numbers.get(j) * one;
                }}
        }
        return 0;
    }

    public long dayOneSecondSolution(List<Integer> numbers){
        numbers.sort(Integer::compareTo);




        return 0;
    }
}
