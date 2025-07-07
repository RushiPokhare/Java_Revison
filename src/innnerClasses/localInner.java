package innnerClasses;

public class localInner {
    void show(){
        System.out.println("Inside Outer Class Method");
        class LocalInnerClass{
            void display(){
                System.out.println("Inside inner class method");
            }
        }
        LocalInnerClass innerClass=new LocalInnerClass();
        innerClass.display();
    }

    public static void main(String[] args) {
        localInner outer=new localInner();
        outer.show();
    }
}
