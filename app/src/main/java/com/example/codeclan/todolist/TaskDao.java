package com.example.codeclan.todolist;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by annalanigan on 08/01/2018.
 */

@Dao
public interface TaskDao {

    @Query("SELECT * FROM Task")
    LiveData<List<Task>> getListOfData();

    @Query("SELECT * FROM Task WHERE TaskId = :taskId")
    LiveData<Task> getTaskById(String taskId);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    Long createNewTask();

    @Delete
    void deleteTask(Task oldTask);

}
