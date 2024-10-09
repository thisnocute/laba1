package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity1 extends AppCompatActivity {

     EditText resultN, resultF;
     Button addfn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main1);

        resultF = findViewById(R.id.Resultfam);
        resultN = findViewById(R.id.Resultname);
        addfn = findViewById(R.id.button);

        addfn.setOnClickListener(v -> {

            String name = resultN.getText().toString();
            String lastname = resultF.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("name", name);
                intent.putExtra("lastname", lastname);
                startActivity(intent);


        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;


        });


    }
}