package collection;

import java.util.Iterator;

public class Demo1 {
    public static void main(String[] args) {
        class A implements Iterable {

            @Override
            public Iterator iterator() {
                Iterator iterator =new Iterator() { // this is an Anonymous class
                    @Override
                    public boolean hasNext() {
                        return false;
                    }

                    @Override
                    public Object next() {
                        return "String";
                    }
                };
                return iterator;
            }
        }
        A a=new A();
        Iterator iterator = a.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());

    }
}

