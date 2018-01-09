package com.example.codeclan.todolist.List;

import com.example.codeclan.todolist.Db.Task;
import com.example.codeclan.todolist.Db.TaskDao;
import com.example.codeclan.todolist.Db.TaskDatabase;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by annalanigan on 05/01/2018.
 */

public class ToDoList implements Serializable {

    ArrayList<Task> list;

    public ToDoList(){
        list = new ArrayList<Task>();
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
