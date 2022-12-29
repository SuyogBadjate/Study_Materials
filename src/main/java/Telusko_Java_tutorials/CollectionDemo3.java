package Telusko_Java_tutorials;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CollectionDemo3 {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("MyName","Navin");
        map.put("Actor","John");
        map.put("CEO","Marisa");
        map.put("Actor","Akshay");
        Set<String> keys=map.keySet();
        for (String key:keys){
            System.out.println(key+" "+map.get(key));
        }


    }

}
