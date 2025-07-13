package StringHandling;
//Conversion between String Buffer to String Builder
public class conversion {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer("Rushi Pokhare");
        String str=stringBuffer.toString(); // That Convert Rushi Pokhare into Normal String

        StringBuilder stringBuilder=new StringBuilder(str);
        System.out.println(stringBuilder);



    }
}
