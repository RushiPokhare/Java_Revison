package StringHandling;

public class S01_SCP {
    public static void main(String[] args) {

        // 🔹 Local Inner Class (NO access modifier like public/private)
        class StringPoolExample {
            void show() {
                // 🔹 Using string literal (stored in SCP)
                String s1 = "Rushi";

                // 🔹 Another literal with same value (points to same SCP object)
                String s2 = "Rushi";

                // 🔹 Using new keyword (creates new object in heap)
                String s3 = new String("Rushi");

                // 🔹 Comparing references
                System.out.println("s1 == s2 : " + (s1 == s2));           // (same SCP object)
                System.out.println("s1 == s3 : " + (s1 == s3));           // (different objects)
                System.out.println("s1.equals(s3) : " + s1.equals(s3));   // (same content)
            }
        }

        // 🔹 Create object of local inner class and call the method
        StringPoolExample obj = new StringPoolExample();
        obj.show();
    }
}
