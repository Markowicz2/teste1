package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.service.media.MediaBrowserService;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    Handler delay = new Handler();

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {



        if(event.getFlags() == KeyEvent.KEYCODE_F6){


            Toast.makeText(this,"LONG",Toast.LENGTH_LONG).show();

        }

        return super.dispatchKeyEvent(event);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* IntentFilter intent = new IntentFilter(Intent.ACTION_MEDIA_BUTTON);
        IntentFilter intent2 = new IntentFilter(Intent.ACTION_HEADSET_PLUG);
        IntentFilter intent3 = new IntentFilter(Intent.ACTION_MEDIA_BUTTON);


        Broadcast myReceiver = new Broadcast();


        registerReceiver(myReceiver, intent);
        registerReceiver(myReceiver, intent2);
*/




    }




}



