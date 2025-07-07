package constructor.chaining.super_keyword;

//use Super with Variables

public class S2_Vehical {
    int maxSpeed=120;
}
class Car extends S2_Vehical{
     int maxSpeed=180;

     void display(){
         System.out.println("Maximum Speed is -->"+super.maxSpeed);
     }
}

class Demo{
    public static void main(String[] args) {
        Car c=new Car();
        c.display();
    }
}
