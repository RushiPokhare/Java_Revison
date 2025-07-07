package innnerClasses;

//Static and nonStatic inner class are used here

public class Outer {
    int instanceVar=10;
    static int staticVar=10;

    class NonStaticClass{
        void Show(){
            System.out.println("This is Non Static Inner Class");
            System.out.println("Instance Variable --> "+instanceVar);
            System.out.println("Static variable --> "+staticVar);
        }
    }

    static class StaticInnerClass{
        void Show(){
            System.out.println("This is Non Static Inner Class");
//            System.out.println("Instance Variable"+instanceVar);  not allow to access from outer class
            System.out.println("Static variable--> "+staticVar);
        }
    }

    public static void main(String[] args) {
        //     For Accessing nonStaticClass
        Outer outer=new Outer();
        Outer.NonStaticClass nonStaticClass=outer.new NonStaticClass();
        nonStaticClass.Show();

        System.out.println("*************");

//        For Accessing StaticInnerClass
        Outer.StaticInnerClass staticInnerClass=new StaticInnerClass();
        staticInnerClass.Show();

    }
}
