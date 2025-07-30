package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2Int_Sorting {
    public static void main(String[] args) {
        List<Integer> listOfNumbers=new ArrayList<>();
        listOfNumbers.add(20);
        listOfNumbers.add(90);
        listOfNumbers.add(76);
        listOfNumbers.add(35);
        listOfNumbers.add(68);

        Collections.sort(listOfNumbers);
        System.out.println(listOfNumbers);
    }
}
