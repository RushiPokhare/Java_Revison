package objectsMethods;

public class HashCode {
    int i=10;
    int j=20;

    void show(){
        System.out.println(i+j);
    }

    public static void main(String[] args) {
        HashCode hashCode=new HashCode();
        HashCode hashCode1=new HashCode();
//        if object pointing to the same Object hashcode will be same
        HashCode hashCode2=hashCode;  //<- hare we assign the 1st object to the another reference to checking hashcode same or not

        System.out.println(hashCode.hashCode());
        System.out.println(hashCode1.hashCode());
        System.out.println(hashCode2.hashCode());
    }
}
