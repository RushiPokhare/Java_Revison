package file_Handling;

import java.io.*;

public class DeSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("Student_Data.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Student student=(Student) objectInputStream.readObject();
        System.out.println(student);

        objectInputStream.close();
        fileInputStream.close();
    }
}
