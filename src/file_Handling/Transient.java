package file_Handling;

import java.io.*;

public class Transient {
    public static void main(String[] args) throws IOException {
        Student2 student2=new Student2(1,"Pravin","PravinPokhare","Pravin@321");
        File file=new File("Transient_Data.txt");
        file.createNewFile();
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student2);
        objectOutputStream.close();
        fileOutputStream.close();
        System.out.println("Object is saved Successfully");
    }
}

class TransientRead{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File file=new File("Transient_Data.txt");
        FileInputStream fileInputStream=new FileInputStream(file);
        ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
        Student2 student2=(Student2) objectInputStream.readObject();
        System.out.println("Using Transient->"+student2);
        objectInputStream.close();
        fileInputStream.close();
    }
}
