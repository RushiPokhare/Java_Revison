package objectsMethods;

import lombok.*;
import lombok.ToString;

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        @AllArgsConstructor
        @NoArgsConstructor
        @ToString
        @Getter
        @Setter
        class Address implements Cloneable {
            private String street;
            private String city;
            private String state;
            private String country;

            @Override
            protected Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @ToString
        @Getter
        @Setter
        class Student implements Cloneable {
            private int id;
            private String name;
            private Address address;

            @Override
            public Object clone() throws CloneNotSupportedException {
                Student student = (Student) super.clone();
                student.address = (Address) address.clone(); // Deep copy
                return student;
            }
        }

        Address address = new Address("Shivajinagar", "Pune", "MH", "IND");
        Student student = new Student(1, "Rushi", address);

        Student student1 = (Student) student.clone();// line for cloning an object

        student1.address.setCity("Nashik");
        student1.address.setCountry("AUS");

        System.out.println("Original: " + student);
        System.out.println("Cloned  : " + student1);
    }
}
