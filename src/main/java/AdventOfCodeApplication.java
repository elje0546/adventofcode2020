import java.io.File;

public class AdventOfCodeApplication {


 public static void main(String [] args) {
     File fileDayThree = new File("/Users/elisabeth/IdeaProjects/adeventofcode/src/main/resources/day3" );
     DayOne dayOne = new DayOne();
     int solution = dayOne.dayOneFindSolution();
     DayTwo dayTwo = new DayTwo();
     var solutionDayTwo = dayTwo.findSolution();
     var secondSolutionDayTwo = dayTwo.findSecondSolution();
     DayThree dayThree = new DayThree(ParseFile.parseFileToArrayString(fileDayThree));
     var solutionDayThree = dayThree.findSolution(30);

     System.out.println("Day one solution:" + solution);
     System.out.println("Day two solution:" + solutionDayTwo);
     System.out.println("Day two solution #2 :" + secondSolutionDayTwo);
     System.out.println("Day three solution:" + solutionDayThree);
     System.out.println("Day three second solution: " + dayThree.findSolutionSecondPart());

 }
}
