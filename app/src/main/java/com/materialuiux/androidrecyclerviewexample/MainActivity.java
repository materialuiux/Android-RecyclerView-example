package com.materialuiux.androidrecyclerviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Ad_RecyclerView ad_recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // dummy  data
        ArrayList<String> list = new ArrayList<>();
        list.add("item1");
        list.add("item2");
        list.add("item3");
        list.add("item4");
        list.add("item5");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ad_recyclerView = new Ad_RecyclerView(this, list);
        recyclerView.setAdapter(ad_recyclerView);
    }
}
