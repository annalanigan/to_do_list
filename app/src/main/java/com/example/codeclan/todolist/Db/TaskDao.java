package com.example.codeclan.todolist.Db;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

/**
 * Created by annalanigan on 08/01/2018.
 */

@Dao
public interface TaskDao {

    @Update
    public void updateUsers(Task... tasks);

    @Query("SELECT * FROM task_list")
    List<Task> getListOfData();

    @Query("SELECT * FROM task_list WHERE id = :taskId")
    Task getTaskById(String taskId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addNewTask(Task task);

    @Delete
    void deleteTask(Task oldTask);

}
