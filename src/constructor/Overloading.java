package constructor;

public class Overloading {
    int id;
    String name;

    Overloading(){
        id=0;
        name="Unknown";
    }

    Overloading(int id){
        this.id=id;
        this.name="unknown";
    }

    Overloading(int id, String name){
        this.id=id;
        this.name=name;
    }

    public void show(){
        System.out.println("ID --> "+id+" "+"Name --> "+name);
    }

    public static void main(String[] args) {
        Overloading c=new Overloading();
        Overloading c1=new Overloading(1);
        Overloading c2=new Overloading(2,"Sai");
        c.show();
        c1.show();
        c2.show();
    }
}
