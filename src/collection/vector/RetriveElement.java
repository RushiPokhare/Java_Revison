package collection.vector;

import java.util.*;

public class RetriveElement {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Sunil");
        vector.add("Anil");
        vector.add("Sushil");
        vector.add("Rushi");
        vector.add("Kartik");
        vector.add("Suhas");
        vector.add("Suman");

//        Retrieval of Element Similar to an Array List methods  ...Enumerator is an Extra Method of the vector.

            System.out.println("Reading Element From the given Vector using Enumerator");
            Enumeration<String> enumeration = vector.elements();
            while(enumeration.hasMoreElements()){
                System.out.println(enumeration.nextElement());
            }
        }
    }
