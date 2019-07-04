package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IntentFilter intent = new IntentFilter(Intent.ACTION_MEDIA_BUTTON);
        IntentFilter intent2 = new IntentFilter(Intent.ACTION_HEADSET_PLUG);



         Broadcast myReceiver = new Broadcast();




         registerReceiver(myReceiver,intent);
         registerReceiver(myReceiver,intent2);









    }

}
