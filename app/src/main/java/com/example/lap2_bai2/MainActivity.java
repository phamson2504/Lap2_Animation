package com.example.lap2_bai2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<Item> items;
    IteamAdapter adt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recy);
        items = new ArrayList<>();
        items.add(new Item("Love Story","Taylor Swift",R.drawable.eclipse));
        items.add(new Item("Love Story","Taylor Swift",R.drawable.eclipse));
        items.add(new Item("Love Story","Taylor Swift",R.drawable.eclipse));
        items.add(new Item("Love Story","Taylor Swift",R.drawable.eclipse));
        adt = new IteamAdapter(MainActivity.this,items);
        LinearLayoutManager linearLayoutManager
                = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setAdapter(adt);
        recyclerView.setLayoutManager(linearLayoutManager);

    }
}