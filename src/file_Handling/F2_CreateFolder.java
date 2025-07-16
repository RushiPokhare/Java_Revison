package file_Handling;

import java.io.File;

public class F2_CreateFolder {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\tempFolder");
        boolean isFolderCreated=file.mkdir();
        System.out.println("Folder is created -"+isFolderCreated);
    }
}
