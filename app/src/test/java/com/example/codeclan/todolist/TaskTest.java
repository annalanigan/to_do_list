package com.example.codeclan.todolist;

import com.example.codeclan.todolist.Db.Task;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by annalanigan on 05/01/2018.
 */

public class TaskTest {

    private Task task1;
    private Task task2;
    private Task task3;

    @Before
    public void before(){
        task1 = new Task("Tidy Room", "kids Room especially!", "home");
        task2 = new Task("buy light bulbs", "for back door and bedside light", "shopping");
        task3 = new Task("Make dentist appointment", "Dylan and Alice", "kids");
    }

    @Test
    public void canGetName(){
        assertEquals("Tidy Room", task1.getName());
    }

    @Test
    public void canGetDetails(){
        assertEquals("Dylan and Alice", task3.getDetails());
    }

    @Test
    public void canGetCompleted(){
        assertEquals(false, task2.getCompleted());
    }

    @Test
    public void canCompleteTask(){
        task1.completeTask();
        assertEquals(true, task1.getCompleted());
    }

}
