package collection.sorting;

public class Demo1 {
    public static void main(String[] args) {
            byte value=10;
            Byte obj=value;
        System.out.println("Autoboxing ->"+obj);

            byte value2=obj;
        System.out.println("Unboxing ->"+value2);

//        Parsing String
        System.out.println("Parsing String");

        String str="10";
        byte parsedByte=Byte.parseByte(str);

    }
}
