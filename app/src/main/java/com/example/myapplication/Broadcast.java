package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

public class Broadcast extends BroadcastReceiver {
    private String TAG = "HeadSet";

    public Broadcast() {
        Log.d(TAG, "Created");
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        KeyEvent event = (KeyEvent)intent.getParcelableExtra(Intent.EXTRA_KEY_EVENT);
        if (event == null) {
            return;
        }

        int action = event.getAction();
        Toast.makeText(context, "Action lauchched", Toast.LENGTH_SHORT).show();
        if (action == KeyEvent.ACTION_DOWN) {
            // do something
            Toast.makeText(context, "BUTTON PRESSED!", Toast.LENGTH_SHORT).show();
        }
        // do something
        if (action == KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE)
            Toast.makeText(context, "Play Pause pressed!", Toast.LENGTH_SHORT).show();
        Log.i("TESTE", intent.getAction());


      /*  if(intent.getAction().equals(AudioManager.ACTION_AUDIO_BECOMING_NOISY)) {

            Log.i("TESTE","etste");
            int state = intent.getIntExtra("state", -1);
            switch(state) {
                case(0):
                    Log.d(TAG, "Headset unplugged");
                    break;
                case(1):
                    Log.d(TAG, "Headset plugged");
                    break;
                default:
                    Log.d(TAG, "Error");
            }
        }
    */
    }
}