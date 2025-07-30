package collection.sorting;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Multi-filed Sorting
public class Demo4CustomObjectSorting {
    public static void main(String[] args) {
        System.out.println("MultiFeild Sorting");
        Actor Actor1=new Actor(56,"Sahil",50000);
        Actor Actor2=new Actor(45,"Rudra",6745);
        Actor Actor3=new Actor(67,"Hrushali",5643);
        Actor Actor4=new Actor(32,"Sumit",89034);
        Actor Actor5=new Actor(23,"Kunal",5542);

        List<Actor> ActorList=new ArrayList<>();
        ActorList.add(Actor1);
        ActorList.add(Actor2);
        ActorList.add(Actor3);
        ActorList.add(Actor4);
        ActorList.add(Actor5);

        Comparator<Actor> idComparator=(Actor o1, Actor o2)-> o1.getId()- o2.getId();
        Comparator<Actor> salaryComparator=(Actor o1, Actor o2)->o1.getSalary()- o2.getSalary();
        Comparator<Actor> nameComparator=(Actor o1, Actor o2)->o1.getName().compareTo(o2.getName());


//        Collections.sort(ActorList,idComparator);
//        Collections.sort(ActorList,salaryComparator);
        Collections.sort(ActorList,nameComparator);

        ActorList.forEach(System.out::println);
    }
}
