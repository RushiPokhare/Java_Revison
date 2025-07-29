package collection.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Demo0CustomObject {
    public static void main(String[] args) {
        Employee employee1=new Employee(1,"Sahil",2000);
        Employee employee2=new Employee(34,"Sunil",34000);
        Employee employee3=new Employee(22,"Anil",60000);
        Employee employee4=new Employee(2,"Rudra",70000);

        List<Employee> employeeList=new ArrayList<>();
        employeeList.addAll(Arrays.asList(employee1,employee2,employee3,employee4));
        System.out.println(employeeList);

        System.out.println("Using Enhance for Loop");
        for (Employee list:employeeList){
            System.out.println(list);
        }


        System.out.println("Using ForEach / Lambda");
        Consumer<Employee> consumer= employee -> {System.out.println(employee);};
        employeeList.forEach(consumer);

        System.out.println("Method Reference");
        Consumer<Employee> consumer2 = System.out::println;
        employeeList.forEach(consumer2);
    }
}
