package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo_NestedList {
    public static void main(String[] args) {
        List<List<String>> nestedList=new ArrayList<>();
        List<String> name=Arrays.asList("Anil","Sunil","Amar","Adesh");
        List<String> education=Arrays.asList("BSC","BE","BTech","B.COM");
        List<String> city=Arrays.asList("Shrirampur","Pune","Mumbai","Shirdi");

        nestedList.add(name);
        nestedList.add(education);
        nestedList.add(city);

        for (List<String> inner:nestedList){
            for (String item:inner){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }
}
