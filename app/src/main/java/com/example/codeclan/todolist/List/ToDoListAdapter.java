package com.example.codeclan.todolist.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.codeclan.todolist.Db.Task;
import com.example.codeclan.todolist.R;

import java.util.*;

/**
 * Created by annalanigan on 05/01/2018.
 */

public class ToDoListAdapter extends ArrayAdapter<Task> {

    public ToDoListAdapter(Context context, ArrayList<Task> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.activity_todolist_item, parent, false);
        }

        Task currentTask = getItem(position);

        if (currentTask.getCompleted() == false) {

//        TextView ranking = (TextView) listItemView.findViewById(R.id.rank);
//        ranking.setText(currentTask.getRanking().toString());

            TextView title = (TextView) listItemView.findViewById(R.id.title_list);
            title.setText(currentTask.getName());

            ImageView icon = (ImageView) listItemView.findViewById(R.id.icon);
            icon.setImageResource(currentTask.getLogo());

            listItemView.setTag(currentTask);
        }

        return listItemView;

    }

}
