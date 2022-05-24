import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReader {

    public int size(String path){ return readerWithFile(path).size(); }
    public ArrayList<String> readerWithFile(String path){
        List<String> readerList = new ArrayList<>();
        File inputFile = new File(path);
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
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return (ArrayList<String>) readerList;
    }
}
