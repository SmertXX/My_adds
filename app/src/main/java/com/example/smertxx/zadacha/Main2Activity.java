package com.example.smertxx.zadacha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void kkk(View view)
    {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void game1(View view)
    {
        Intent intent = new Intent(this,Game1.class);
        startActivity(intent);
    }
    public void game2(View view)
    {
        Intent intent = new Intent(this,Game2.class);
        startActivity(intent);
    }
    public void game3(View view)
    {
        Intent intent = new Intent(this,Game3.class);
        startActivity(intent);
    }
    public void game4(View view)
    {
        Intent intent = new Intent(this,Game4.class);
        startActivity(intent);
    }
}
