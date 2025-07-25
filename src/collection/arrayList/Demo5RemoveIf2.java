package collection.arrayList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

//for Checking the List contains even number
public class Demo5RemoveIf2 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(50);
        list.add(39);
        list.add(45);
        list.add(34);

        list.removeIf(n->n%2==0);
        System.out.println(list);
    }
}


//Using Anonymous Class

/*
package collection.arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Demo5RemoveIf2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(50);
        list.add(39);
        list.add(45);
        list.add(34);

        // Using anonymous class instead of lambda
        Predicate<Integer> evenPredicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n % 2 == 0;
            }
        };

        list.removeIf(evenPredicate);

        System.out.println(list);  // Output: [39, 45]
    }
}
*/
