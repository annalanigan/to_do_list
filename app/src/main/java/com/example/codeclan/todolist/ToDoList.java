package com.example.codeclan.todolist;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by annalanigan on 05/01/2018.
 */

public class ToDoList implements Serializable {

    ArrayList<Task> list;

    public ToDoList(){
        list = new ArrayList<Task>();
        list.add(new Task("food shop", "Sainsburys", "shopping"));
        list.add(new Task("buy lighbulb", "halogen and 40 watt", "shopping"));
        list.add(new Task("build drawer unit", "kids bedroom", "home"));
    }

    public void addItem(Task task){
        list.add(task);
    }

    public int getItemRank(Task thisTask){
        int rank = list.indexOf(thisTask);
        return rank += 1;
    }

    public ArrayList<Task> getList(){
        return new ArrayList<Task>(list);
    }


}
