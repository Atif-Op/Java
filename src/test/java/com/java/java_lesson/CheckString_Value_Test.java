package com.java.java_lesson;

import org.junit.Test;

import static junit.framework.TestCase2.assertEquals;

public class CheckString_Value_Test {
    @Test
    public void getName() {
        CheckString_Value p = new  CheckString_Value();
        assertEquals("atif",p.setName("atif"));
    }
}
