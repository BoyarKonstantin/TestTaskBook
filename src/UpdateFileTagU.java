import java.util.ArrayList;
import java.util.List;

public class UpdateFileTagU {
    public void update(){
        String path = "C:\\Users\\Konstantin\\IdeaProjects\\TestTaskForHundredDollars\\input.txt";
        FileReader fileReader = new FileReader();
        FileWriter fileWriter = new FileWriter();
        List<String> info = new ArrayList<>();
        for(int i = 0; i < fileReader.size(path); i++){
            if(fileReader.readerWithFile(path).get(i) == null) continue;
            String readInfo = fileReader.readerWithFile(path).get(i);
            char[] readChar = readInfo.toCharArray();
            for(int j = 0; j < readChar.length; j++ ){
                if (readChar[j] == 'u'){
                    info.add(readInfo);
                }
                else continue;
            }
        }
        fileWriter.writeToFile(path, (ArrayList<String>) info, "UpdateUTXT");
        System.out.println(info);
    }
}
