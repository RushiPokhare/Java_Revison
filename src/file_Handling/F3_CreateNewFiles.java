package file_Handling;

import java.io.File;
import java.io.IOException;

public class F3_CreateNewFiles {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\tempFolder\\"+i);
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Files Are Created");
    }
}
