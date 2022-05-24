import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileWriter {

    public void writeToFile(String path, ArrayList<String> info, String filename){
        try {
            File file = new File("C:\\Users\\Konstantin\\IdeaProjects\\TestTaskForHundredDollars", filename);
            java.io.FileWriter fileWriter = new java.io.FileWriter(file);
            for(int i = 0; i < info.size(); i++){
                fileWriter.write(info.get(i)+"\n");
            }
            System.out.println("File has been created");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
