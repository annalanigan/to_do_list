package com.example.codeclan.todolist.Db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.codeclan.todolist.Db.Task;
import com.example.codeclan.todolist.Db.TaskDao;

/**
 * Created by annalanigan on 09/01/2018.
 */

@Database(entities = {Task.class}, version = 1)
public abstract class TaskDatabase extends RoomDatabase{

    public abstract TaskDao taskDao();
}
