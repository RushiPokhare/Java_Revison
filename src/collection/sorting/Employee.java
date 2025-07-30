package collection.sorting;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class Employee implements Comparable<Employee>{
    int id;
    String name;
    int salary;
//    employee1.CompareTo(Employee2)
    @Override
    public int compareTo(Employee employee) {
//        return this.id-employee.id;
//        return this.salary-employee.salary;
        return this.name.compareTo(employee.name);
    }

/*    It means:
    this → emp1
    employee → emp2
    */
}
