import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReader {
    
    public ArrayList<String> reader(){
        List<String> readerList = new ArrayList<>();
        File inputFile = new File("C:\\Users\\Konstantin\\IdeaProjects\\TestTaskForHundredDollars\\input.txt");
        java.io.FileReader fileReader;
        BufferedReader reader;

        {
            try {
                fileReader = new java.io.FileReader(inputFile);
                reader = new BufferedReader(fileReader);
                String line = reader.readLine();
                int i = 0;
                while (line != null){
                    i++;
                    line = reader.readLine();
                    readerList.add(line);
                }
                System.out.println(readerList.get(0));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return (ArrayList<String>) readerList;
    }
}
