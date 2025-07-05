package Methods;

public class Getter_Constructor {
    private int id;
    private String name;

    Getter_Constructor(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Getter_Constructor g1=new Getter_Constructor(1,"Aniket");
        Getter_Constructor g2=new Getter_Constructor(2,"Pravin");

        System.out.println("ID and Name is - "+ g1.getId()+" "+g1.getName());

        System.out.println("ID and Name is -"+g2.getId()+" "+g2.getName());

    }
}
