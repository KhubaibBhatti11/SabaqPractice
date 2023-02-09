package com.example.saqbaq;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainnActivity extends AppCompatActivity {
    Button wellcomebtn;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainn);

        wellcomebtn = findViewById(R.id.welbtn);
        wellcomebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainnActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }

}