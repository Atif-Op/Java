package com.java.java_lesson.arrayofobject;
//Array of object
public class Person {

    public static void main(String args[]) {
        Person pers[] = new Person[5];
        Person p = new Person();
        pers[0] = new Person();
        pers[1] = new Person();
        pers[2] = new Person();
        pers[3]=p;
        pers[3]=null;

        //For each loop java 8 features
        //It is a newer way with lesser code to iterate over an array.
        //faster compare to for loop
        for (Person person:pers) {
            System.out.println(person);
        }
        
    }
}