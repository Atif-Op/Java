package com.java.java_lesson.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Collection {
    public static void main(String args[]) {
        //Before generic
        List li = new ArrayList();   //implement List to create object(List is an interface)
        li.add(1);
        li.add("atif");
        li.add('s');
        li.add(10.4);
        li.add(true);

        for (Object i : li) {  //we use object because we dont kow the type of object
            System.out.print(i + " ");


            Iterator it = li.iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }


            ListIterator il = li.listIterator();
            while (il.hasPrevious()) {
                System.out.println(il.previous());
            }

        }

//        After generic IT ONLY STORE SIMILAR TYPE OF DATA OBJECT
//        List <Integer> li2= new ArrayList<Integer>();
//        li2.add(1);
//        li2.add("atif");
//        li2.add('s');
//        li2.add(10.4);
//        li2.add(true);
//
//
//        for ( Object i:li2) {   //
//            System.out.println(i);
//        }


    }
}

