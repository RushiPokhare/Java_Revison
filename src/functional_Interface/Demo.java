package functional_Interface;

public class Demo {
    public static void main(String[] args) {
        interface Predicate{
            public boolean test(int number);
        }

//        1.Traditional Way
        class EvenTest implements Predicate{

            @Override
            public boolean test(int number) {
                return number%2==0;
            }
        }

        Predicate predicate=new EvenTest();
        System.out.println("is even->"+predicate.test(3));

//        2.Anonymous Way
        Predicate predicate1=new Predicate(){

            @Override
            public boolean test(int number) {
                return number%2==0;
            }
        };
        System.out.println("is Even->"+predicate1.test(5));

//        3.Lambda Expression
        Predicate predicate2=(int number)->{return number%2==0;};
        System.out.println("is Even->"+predicate2.test(10));

//
    }
}
