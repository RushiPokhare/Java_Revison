package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Demo1HashMap {
    public static void main(String[] args) {
        Map<Integer,String> studentList=new HashMap<>();
        studentList.put(1,"Sahil");
        studentList.put(2,"Sachin");
        studentList.put(36,"Amar");
        studentList.put(4,"Kunal");

        System.out.println("Value of give key is->"+studentList.get(36));
        System.out.println("2 Key is there ? ->"+studentList.containsKey(2));
        System.out.println("All keys are ->"+studentList.keySet());
        System.out.println(studentList);

    }
}
