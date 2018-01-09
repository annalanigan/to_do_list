package com.example.codeclan.todolist.Activities;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.codeclan.todolist.Db.Task;
import com.example.codeclan.todolist.Db.TaskDao;
import com.example.codeclan.todolist.Db.TaskDatabase;
import com.example.codeclan.todolist.R;

public class AddTaskActivity extends AppCompatActivity {

    EditText titleText;
    EditText detailsText;
    EditText categoryChoice;
    EditText dateChoice;
    TaskDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);

        db = Room.databaseBuilder(getApplicationContext(),
                TaskDatabase.class, "task_list").build();

        titleText = findViewById(R.id.title);
        detailsText = findViewById(R.id.details);
//        dateChoice = findViewById(R.id.due_date);
        categoryChoice = findViewById(R.id.add_category);

    }

    public void onAddButtonClicked(View button){
        String newTitle = titleText.getText().toString();
        String newDetails = detailsText.getText().toString();
        String newCategory = categoryChoice.getText().toString();

        Task newTask = new Task(newTitle, newDetails, newCategory);

        db.taskDao().addNewTask(newTask);

        Intent intent = new Intent(this, ToDoListActivity.class);
        startActivity(intent);

    }

}
