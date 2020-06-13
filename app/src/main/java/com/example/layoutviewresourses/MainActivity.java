package com.example.layoutviewresourses;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    // Textviews and Button declaration

    TextView OutPut;
    Button First_Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // id declaration

        OutPut = (TextView)findViewById(R.id.textView2);
        First_Button = (Button)findViewById(R.id.button);

    }

    @Override
    public void onClick(View view) {
        OutPut.setText("You are welcome to Nacoss Noun Java Class");
    }

    public void displayText(View view) {
        OutPut.setText("Prepared For the Next Class");
    }
}
