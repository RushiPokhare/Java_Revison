package objectsMethods;

import lombok.ToString;
import lombok.*;

// Shallow Copy <- This is a Shallow Copy
public class ShallowCopy1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        @AllArgsConstructor
        @NoArgsConstructor
        @ToString
        @Getter
        @Setter
        class Student implements Cloneable {
            private int id;
            private String name;

            @Override
            public Object clone() throws CloneNotSupportedException {
                return super.clone();
            }
        }
        Student student=new Student(1,"Rushi");

        Student student1= (Student) student.clone();

        System.out.println(student.hashCode());
        System.out.println(student1.hashCode());
    }
}
