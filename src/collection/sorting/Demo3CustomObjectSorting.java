package collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Single Field Sorting

public class Demo3CustomObjectSorting {
    public static void main(String[] args) {
        Employee employee1=new Employee(56,"Sahil",50000);
        Employee employee2=new Employee(45,"Rudra",6745);
        Employee employee3=new Employee(67,"Hrushali",5643);
        Employee employee4=new Employee(32,"Sumit",89034);
        Employee employee5=new Employee(23,"Kunal",5542);

        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        Collections.sort(employeeList);
        employeeList.forEach(System.out::println);
    }
}
