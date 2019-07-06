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
import android.os.CountDownTimer;
import android.os.Handler;
import android.service.media.MediaBrowserService;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
     int verifica = 0;
    Handler delay = new Handler();

    @Override
    public boolean dispatchKeyEvent(final KeyEvent event) {
        if(event.getAction() == KeyEvent.ACTION_DOWN){

             new CountDownTimer(5000, 10000) {
                @Override
                public void onTick(long l) {
                    verifica = event.getAction() + verifica;
                    if(verifica >0){
                       cancel();
                    }
                }

                @Override
                public void onFinish() {
                    onToast(verifica);
                }
            }.start();
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


    public void onToast(int verifica){
        if(verifica ==0){
            Toast.makeText(this,"Basculando",Toast.LENGTH_LONG);
        }

    }



}



