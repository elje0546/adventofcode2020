import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ParseFile {

    protected static List<Integer> parseFileToArray(File f){
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(f));
        } catch(FileNotFoundException e){
            System.out.println("could not read file");
            System.exit(1);
            return null;
        }

        List<Integer> numbers = new ArrayList<>();
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


    protected static List<String> parseFileToArrayString(File f){
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(f));
        } catch(FileNotFoundException e){
            System.out.println("could not read file");
            System.exit(1);
            return null;
        }

        List<String> lines = new ArrayList<>();
        String s;
        while (true){
            try {
                if((s = reader.readLine()) == null) break;
            } catch(IOException e) {
                e.printStackTrace();
                System.exit(2);
                return null;
            }
            lines.add(s);
        }
        return lines;
    }


    protected static List<String> parseFileToStringForEveryNewLine(File f){
        BufferedReader reader;
        try{
            reader = new BufferedReader(new FileReader(f));
        } catch(FileNotFoundException e){
            System.out.println("could not read file");
            System.exit(1);
            return null;
        }

        List<String> lines = new ArrayList<>();
        StringBuffer buffer = new StringBuffer();
        String s;
        while (true){
            try {
                if((s = reader.readLine()) == null){
                    break;
                }else if(s.isEmpty()){
                    lines.add(buffer.toString());
                    buffer = new StringBuffer();
                }
            } catch(IOException e) {
                e.printStackTrace();
                System.exit(2);
                return null;
            }
            buffer.append(" ");
            buffer.append(s);
        }
        return lines;
    }
}
