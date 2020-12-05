import java.math.BigInteger;
import java.util.List;

public class DayThree {
    private List<String> lines;

    public DayThree(List<String> lines) {
        this.lines = lines;
    }


    BigInteger findSolution(int characters, int jumps, int rows){
        BigInteger trees = BigInteger.ZERO;
        int index = 0;
        var indexCounter = new IndexCounter(characters, jumps , 0);
        for(int i = 0; i<lines.size() ; i= i+ rows){
            if(lines.get(i).charAt(index)== '#'){
                trees = trees.add(BigInteger.ONE);
            }
            index = indexCounter.index();
        }

        return trees;
    }

    BigInteger findSolution(int characters){
        return findSolution(characters, 3, 1);
    }

    BigInteger findSolutionSecondPart(){
        var firs = findSolution(30, 1, 1);
        var sec = findSolution(30, 3, 1);
        var thi = findSolution(30, 5, 1);
        var four = findSolution(30, 7, 1);
        var fiv = findSolution(30, 1, 2);
        return firs.multiply(sec).multiply(thi).multiply(four).multiply(fiv);
    }

    public static class IndexCounter{
        private final int jumps;
        private  int index;
        private final int max;

        public IndexCounter(int max, int jumps, int start){
            this.max = max;
            this.index = start;
            this.jumps = jumps;
        }

        public int index(){
            index += jumps;
            if(index> max){
                index -= max+1;
            }
            return index;
    }}
}
