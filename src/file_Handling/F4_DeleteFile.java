package file_Handling;

import java.io.File;

public class F4_DeleteFile {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Rushi\\OneDrive\\Desktop\\abc.txt");
        boolean isFileDelete=file.delete();
        System.out.println("File are Deleted "+isFileDelete);
    }
}
