package file_Handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) throws IOException {
        Student student=new Student(1,"Rushi","Admin","Admin@123");
        File file=new File("Student_Data.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.close();
        fileOutputStream.close();

        System.out.println("Object Save Successfully");
    }
}
