package com.softeng.conorredington.assignment1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void testUsername (){
        Student student;
        student = new Student("Conor", 21, "6/10/1997", "15332311");
        assertEquals("Conor21", student.getUserName());
    }
}
