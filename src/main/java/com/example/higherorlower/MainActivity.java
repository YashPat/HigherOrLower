package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int sec = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSec();
    }
    public void setSec(){
        Random rand = new Random();
        sec = rand.nextInt((10 - 1) + 1) + 1;
    }
    public void clickFunc(View view){
        EditText guess = (EditText)findViewById(R.id.editText2);
        int gues = Integer.parseInt(guess.getText().toString());
        if (gues == sec){
            Toast.makeText(MainActivity.this,"You got it! Number has reset", Toast.LENGTH_LONG).show();
            setSec();
        }
        else{
            Toast.makeText(MainActivity.this,"Try again",Toast.LENGTH_LONG).show();
        }
    }
}
