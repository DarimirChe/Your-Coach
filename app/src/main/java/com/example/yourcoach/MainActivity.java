package com.example.yourcoach;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    //Button add_button = findViewById(R.id.add_button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);


        List<Item> items = new ArrayList<Item>();
        items.add(new Item("Jopa Popa", "poop@gmail.pop"));


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(), items));

//        add_button.setOnClickListener(new View.OnClickListener(){
//            public void onClick(View v) {
//                // Обработка нажатия
//
//            }
//        });
    }

}