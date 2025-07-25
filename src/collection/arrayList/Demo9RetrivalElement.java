package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class Demo9RetrivalElement {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Sunil");
        list.add("Anil");
        list.add("Sushil");
        list.add("Rushi");
        list.add("Kartik");
        list.add("Suhas");
        list.add("Suman");

//        Retrieval of Element

//        1. Directly
        System.out.println("Directly Access the Element");
        System.out.println(list);

//        2. Access Single Element
        System.out.println("Reading Single Element");
        System.out.println("Element at 4th Index ->"+list.get(4));
        System.out.println("Element from Last Index ->"+list.getFirst());
        System.out.println("Element from Last Index ->"+list.getLast());

//        System.out.println("Also get last Element-->"+list.get(list.size()-1));

//        3.Traditional For Loop
        System.out.println("Reading Element Using Traditional For Loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));

//        4. Enhance For Loop
            System.out.println("Reading Element Using Enhance For Loop");
            for (String temp:list){
                System.out.println(temp);
            }

//         5. Using Java 8 forEach Method
            System.out.println("Reading Element Using forEach");
            Consumer consumer=input -> System.out.println(input);
            list.forEach(consumer);

//          6. Method Reference
            System.out.println("Reading Element Using Method Reference");
            list.forEach(System.out::println);

//          7. using iterator --> Cursor
            System.out.println("Reading Element From the given list using Iterator");
            Iterator<String> iterator = list.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }

//            8.Using ListIterator is only used for the List.
            System.out.println("Reading Element using List Iterator <--- Only used for List ");
            ListIterator<String> listIterator = list.listIterator();
            while (listIterator.hasNext()){
                System.out.println(listIterator.next());
            }
        }
    }
}
