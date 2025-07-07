package constructor;

import java.sql.SQLOutput;

public class Copy {
    int id;
    String name;

    Copy(int id,String name){
        this.id=id;
        this.name=name;
    }

    Copy(Copy other){
        this.id= other.id;
        this.name= other.name;
    }

    void display(){
        System.out.println(id+"  "+name);
    }
    public static void main(String[] args) {
        Copy c=new Copy(1,"Sai");
        c.display();

        Copy c1=new Copy(c);
        c1.display();
    }
}
