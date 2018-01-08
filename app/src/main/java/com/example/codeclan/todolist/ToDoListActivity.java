package com.example.codeclan.todolist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class ToDoListActivity extends AppCompatActivity {

    Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolist);

        ToDoList list = new ToDoList();
        ArrayList<Task> listToView = list.getList();

        ToDoListAdapter adapter = new ToDoListAdapter(this,listToView);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        addButton = findViewById(R.id.button);
    }

    // when clicking on the list item - takes you through to the further details
    public void getDetails(View listItem){

        Task task = (Task) listItem.getTag();

        Intent intent = new Intent(this, TaskActivity.class);
        intent.putExtra("task", task);

        startActivity(intent);

    }

    // button clicked to add new task
    public void onAddTaskButtonClicked(View button){

        Log.d(getClass().toString(), "clicked add task btn" );

        Intent intent = new Intent(this, AddTaskActivity.class);

        startActivity(intent);
    }


//    @Override
//    public boolean onCreateOptionsMenu(Menu menu){
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.activity_todolist, menu);
//        return true;
//    }
}
