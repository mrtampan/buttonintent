package com.example.btnintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.net.Uri;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void panggil(View view){
        String nomor = "083815355337";
        Intent panggil = new Intent(Intent.ACTION_DIAL);

    }

    public void buka(View view){
        String url = "http://thamrin.ac.id";
        Intent bukabrowser = new Intent(Intent.ACTION_VIEW);
        bukabrowser.setData(Uri.parse(url));
        startActivity(bukabrowser);
    }

    public void activity2(View view){
        Intent activity2 = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(activity2);
    }



}