package com.remijonathan.showname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button showMe;
    private TextView showText;
    private EditText userText;
    private Button showTag;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showMe = findViewById(R.id.button_show_name);
        showText = findViewById(R.id.textView);
        userText = findViewById(R.id.editText);
        showTag = findViewById(R.id.button_show_tag);

        showMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = userText.getText().toString();
                showText.setText("Hello, "+name+", how are you?");
            }
        });

        showTag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hi! I'm a Nice, Hot, Toast",Toast.LENGTH_LONG).show();
            }
        });
    }
}
