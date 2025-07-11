package objectsMethods;

import lombok.*;
import lombok.ToString;
// Shallow Copy  <-- Problem With Shallow Copy
public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        @AllArgsConstructor
        @NoArgsConstructor
        @ToString
        @Getter
        @Setter
        class Address{
            private String street;
            private String city;
            private String state;
            private String country;
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @ToString
        @Getter
        @Setter
        class Student implements Cloneable {
            private int id;
            private String name;
            private Address address; // Has a Relationship (Student has an Address)

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        Address address=new Address("Shivajinagar","Pune","MH","IND");
        Student student=new Student(1,"Rushi",address);

        Student student1= (Student) student.clone();

        student1.address.setCity("nashik");
        student1.address.setCountry("AUS");
        System.out.println(student);
        System.out.println(student1);
    }
}
