package StringHandling;
public class StringBuilder1 {
    public static void main(String[] args) {
        String str="Python"; // Can't Able to Change Original String Because String is Immutable

        StringBuffer stringBuffer=new StringBuffer(str);

//        1. Append
        stringBuffer.append(" Programming");
        System.out.println("After Append :"+stringBuffer);

//        2. Insert
        stringBuffer.insert(7,"is a ");
        System.out.println("After Insert :"+stringBuffer);

//       3. Delete
        stringBuffer.delete(7,12);
        System.out.println("After Delete :"+stringBuffer);

//        4. Reverse
        stringBuffer.reverse();
        System.out.println("After Reverse :"+stringBuffer);
    }
}
