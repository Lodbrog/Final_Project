package com.example.android.final_project;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pyramidOfGiza(View view) {
        Intent intent = new Intent(MainActivity.this, PyramidOfGizaActivity.class);
        startActivity(intent);
    }
    public void babylon(View view) {
        Intent intent = new Intent(MainActivity.this, BabylonActivity.class);
        startActivity(intent);
    }
    public void artemis(View view) {
        Intent intent = new Intent(MainActivity.this, ArtemisActivity.class);
        startActivity(intent);
    }
    public void statueOfZeus(View view) {
        Intent intent = new Intent(MainActivity.this, StatueOfZeusActivity.class);
        startActivity(intent);
    }
    public void halicarnassus(View view) {
        Intent intent = new Intent(MainActivity.this, HalicarnassusActivity.class);
        startActivity(intent);
    }
    public void colossus(View view) {
        Intent intent = new Intent(MainActivity.this, ColossusActivity.class);
        startActivity(intent);
    }
    public void alexandria(View view) {
        Intent intent = new Intent(MainActivity.this, AlexandriaActivity.class);
        startActivity(intent);
    }
}
