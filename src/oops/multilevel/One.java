package multilevel;
//Multilevel
public class One {
    void oneDisplay(){
        System.out.println("Hello From 1st Class");
    }
}

class Two extends One{
    void twoDisplay(){
        System.out.println("Hello From 2nd Class");
    }
}

class Three extends Two{
    void threeDisplay(){
        System.out.println("Hello From 3rd Class");
    }
}

class Main{
    public static void main(String[] args) {
        Three three=new Three();
        three.oneDisplay();
        three.twoDisplay();
        three.threeDisplay();
    }
}
