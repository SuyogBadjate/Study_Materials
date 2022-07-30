package AnujBhaiyaaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        ArrayList<String> Student = new ArrayList<>();
        Student.add("Rakesh");
        Student.add(0,"Suyog");
        System.out.println(Student);

        List<String> list=new ArrayList<>();
        list.add("Mahesh");
        list.addAll(Student);
        System.out.println(list);

        list.set(2,"Sajan");
        System.out.println(list);

        System.out.println(list.contains("Suyog"));

        //Traverse an ArrayList For loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element is: "+list.get(i));
        }

        //ForEach loop
        for(String ele:list){
            System.out.println("Foreach Element is: "+ele);
        }

        //Iterator
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println("iterator: "+it.next());
        }



//        System.out.println(list.get(1));
//        list.remove(0);
//        list.remove("Suyog");
//        System.out.println(list);
//        list.clear();
//        System.out.println(list);

    }
}
