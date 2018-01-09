package com.example.codeclan.todolist.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.codeclan.todolist.Db.Task;
import com.example.codeclan.todolist.R;

public class TaskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        TextView title = findViewById(R.id.view_title);
        TextView details = findViewById(R.id.view_details);
        TextView category = findViewById(R.id.view_category);
        ImageView logo = findViewById(R.id.view_logo);
//        TextView date = findViewById(R.id.view_date);

        Intent intent = getIntent();
        Task thisTask = (Task) intent.getSerializableExtra("task");

        title.setText(thisTask.getName());
        details.setText(thisTask.getDetails());
        category.setText(thisTask.getCategory());
        logo.setImageResource(thisTask.getLogo());
//        date.setText(thisTask.getDue().toString());

    }
}
