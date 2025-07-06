package Methods;

public class Constr_Getter_DiffClass {
    private int id;
    private String name;
    private static String college="MCERC";

    Constr_Getter_DiffClass(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public static String getCollege(){
        return college;
    }
}

class Subclass{
    public static void main(String[] args) {
        Constr_Getter_DiffClass c1=new Constr_Getter_DiffClass(1,"Rushi");
        System.out.println("Student id is -"+c1.getId()+" "+" Student Name -"+c1.getName()+" "+"Student College Name -"+Constr_Getter_DiffClass.getCollege());

    }
}
