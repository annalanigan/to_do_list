package com.example.codeclan.todolist.Db;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import com.example.codeclan.todolist.R;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by annalanigan on 05/01/2018.
 */

@Entity(tableName = "task_list")
public class Task implements Serializable {

    @PrimaryKey (autoGenerate = true)
    private int id;

    @ColumnInfo(name = "title")
    private String name;

    @ColumnInfo(name = "details")
    private String details;

    @ColumnInfo(name = "completed")
    private Boolean completed;

    @ColumnInfo(name = "category")
    private String category;

//    @ColumnInfo(name = "due")
//    private Date due;

    public Task() {}

    public Task(String name, String details, String catName){
        this.name = name;
        this.details = details;
        this.completed = false;
        this.category = catName;
//        this.due = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }

    public void completeTask(){
        this.completed = true;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

//    public Date getDue() {
//        return due;
//    }
//
//    public void setDue(Date due) {
//        this.due = due;
//    }

    public int getLogo() {
        int logoLocation = 0;
        if (category == "shopping") {
            logoLocation = R.drawable.shopping;
        }
        else if (category == "home"){
            logoLocation = R.drawable.home;
        }
        else if (category == "work") {
            logoLocation = R.drawable.work;
        }
        else if (category == "kids"){
            logoLocation = R.drawable.kids;
        }
        else {
            logoLocation = R.drawable.other;
        }
        return logoLocation;
    }

}
