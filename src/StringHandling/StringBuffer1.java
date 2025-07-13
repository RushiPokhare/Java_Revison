package StringHandling;
public class StringBuffer1 {
    public static void main(String[] args) {
        String str="Java"; // Can't Able to Change Original String Because String is Immutable

        StringBuffer stringBuffer=new StringBuffer(str);

//        1. Append
        stringBuffer.append(" Programming");
        System.out.println("After Append :"+stringBuffer);

//        2. Insert
        stringBuffer.insert(5,"is a ");
        System.out.println("After Insert :"+stringBuffer);

//       3. Delete
        stringBuffer.delete(5,9);
        System.out.println("After Delete :"+stringBuffer);

//        4. Reverse
        stringBuffer.reverse();
        System.out.println("After Reverse :"+stringBuffer);
    }
}
