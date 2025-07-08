package oops.hierarchical;
/* Hierarchical inheritance where multiple classes (Two, Three, Four) inherit from a single class (One),
allowing them to share the same methods from class One.*/

public class One {
    void oneDisplay(){
        System.out.println("From Class One");
    }
}

class Two extends One{
    void twoDisplay(){
        System.out.println("From Class Two");
    }
}

class Three extends One{
    void threeDisplay(){
        System.out.println("From Class Three");
    }
}

class Four extends One{
    void fourDisplay(){
        System.out.println("From Class Four");
    }
}

class main{
    public static void main(String[] args) {
        Two two=new Two();
        two.oneDisplay();
        two.twoDisplay();

        Three three=new Three();
        three.oneDisplay();
        three.threeDisplay();

        Four four=new Four();
        four.fourDisplay();
        four.oneDisplay();
    }
}