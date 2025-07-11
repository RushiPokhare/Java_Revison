package objectsMethods;

public class GetClass {
    public static void main(String[] args) {
        class Student{
            void show(){
                System.out.println("From student class");
            }
            Student(){
                System.out.println("Constructor");
            }
        }
        Student student=new Student();
        System.out.println(student.getClass());
    }
}
