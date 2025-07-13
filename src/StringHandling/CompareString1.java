package StringHandling;

import java.sql.SQLOutput;

//using EqualsIgnoreCase Method
public class CompareString1 {
    public static void main(String[] args) {
        class Methods {
            String name;
            String address;

            Methods(String name,String address) {
                this.name=name;
                this.address= address;
            }
        }
        Methods methods=new Methods("ABC","Pune");
        Methods methods1=new Methods("abc","Mumbai");
        System.out.println(methods.name.equalsIgnoreCase(methods1.name));
        System.out.println(methods.address.equalsIgnoreCase(methods1.address));
    }
}
