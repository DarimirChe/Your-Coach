package com.example.yourcoach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button add_button = findViewById(R.id.add_button);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        add_button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                // Обработка нажатия

            }
        });
    }

}