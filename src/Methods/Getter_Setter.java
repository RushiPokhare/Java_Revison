package Methods;

public class Getter_Setter {
    private int id;
    private String name;

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id=id;
    }

    public void setName(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        Getter_Setter g1=new Getter_Setter();
        g1.setId(1);
        g1.setName("Sai");
        System.out.println(g1.getId()+"  "+g1.getName());
    }
}
