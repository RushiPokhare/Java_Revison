package file_Handling;

import java.io.File;
import java.io.IOException;

public class F1_Createfile {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\abc.txt");
        try {
            if(file.createNewFile()){
                System.out.println("File is Created");
            } else {
                System.out.println("File is Not Created");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
