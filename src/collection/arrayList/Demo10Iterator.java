package collection.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Demo10Iterator {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Sunil");
        list.add("Anil");
        list.add("Sushil");
        list.add("Rushi");
        list.add("Kartik");
        list.add("Suhas");
        list.add("Suman");

            System.out.println("Reading Element From the given list using Iterator");
            Iterator<String> iterator = list.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }
    }
