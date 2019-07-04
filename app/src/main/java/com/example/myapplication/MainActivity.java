package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intent = new IntentFilter(Intent.ACTION_MEDIA_BUTTON);
         Broadcast myReceiver = new Broadcast();

         registerReceiver(myReceiver,intent);
    }

}
