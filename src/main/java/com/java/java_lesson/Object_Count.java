package com.java.java_lesson;

public class Object_Count {
    static private int count;

    public Object_Count(){

        count++;
    }

     int getCount(){
        return count;
    }

    public int count(){
        int object_Counter=0;
        do{
            Object_Count obj=new Object_Count();
            object_Counter++;
        }
        while(object_Counter<4);
        return object_Counter;
    }

}
