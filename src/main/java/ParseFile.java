import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ParseFile {

    protected static List<Integer> parseFileToArray(File f){
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(f));
        } catch(FileNotFoundException e){
            System.exit(1);
            return null;
        }

        List<Integer> numbers = new ArrayList<Integer>();
        String s;
        while (true){
            try {
                if((s = reader.readLine()) == null) break;
            } catch(IOException e) {
                e.printStackTrace();
                System.exit(2);
                return null;
            }
            numbers.add(Integer.parseInt(s));
        }
        return numbers;
    }
}
