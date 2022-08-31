package com.java.java_lesson.collection;


import java.util.HashMap;

public class Map {
    public static void main(String args[]) {

        java.util.Map<Integer, String> map = new HashMap<>();
        map.put(1, "atif");
        map.put(100, "Amit");
        map.put(101, "Vijay");
        map.put(102, "Rahul");

        //cannot iterate element using iterator or for each loop
        //First convert it into set keySet() or entrySet() method.
        //Converting to Set so that we can traverse
        // Set set=map.entrySet();
//        Iterator itr=set.iterator();
//        while(itr.hasNext()){

        for (java.util.Map.Entry m : map.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
    }
}
