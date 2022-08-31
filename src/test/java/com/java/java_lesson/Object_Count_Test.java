package com.java.java_lesson;

import org.junit.Test;

import static junit.framework.TestCase2.assertEquals;

public class Object_Count_Test {
    //testing using manual object creation..
    @Test
    public void get() {
        Object_Count obj=new Object_Count();
        Object_Count obj1=new Object_Count();
        Object_Count obj2=new Object_Count();
        assertEquals(3, obj.getCount());
    }

    //testing count of object using so while loop..
@Test
    public void whileCounter() {
        Object_Count obj=new Object_Count();
        assertEquals(4,obj.count());
    }


}
