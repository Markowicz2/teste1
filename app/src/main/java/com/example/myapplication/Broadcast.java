package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

public class Broadcast extends BroadcastReceiver {
    private String TAG = "HeadSet";

    public Broadcast()
    {super();
        Log.d(TAG, "Created");
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        if(intent.getAction().equals(Intent.ACTION_MEDIA_BUTTON)) {

            KeyEvent event = (KeyEvent) intent.getParcelableExtra(Intent.EXTRA_KEY_EVENT);
            if (event == null) {
                return;

            }

            Log.i("TESTE", "Entrou aki");
            Toast.makeText(context, "NUMERO: " + event.getKeyCode(), Toast.LENGTH_LONG).show();
            int action = event.getAction();

            Toast.makeText(context, "Action lauchched", Toast.LENGTH_SHORT).show();
            if (action == KeyEvent.ACTION_DOWN) {
                // do something
                Toast.makeText(context, "BUTTON PRESSED!", Toast.LENGTH_SHORT).show();
                Toast.makeText(context, "teste", Toast.LENGTH_LONG).show();
                Log.i("TESTE ACTION", intent.getAction());
            }
            // do something
            if (action == KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE) {
                Toast.makeText(context, "Play Pause pressed!", Toast.LENGTH_SHORT).show();
                Log.i("TESTE ACTION2", intent.getAction());
            }

        }else if(intent.getAction().equals(Intent.ACTION_HEADSET_PLUG)) {

            int state = intent.getIntExtra("state", -1);
            switch(state) {
                case(0):
                    Log.d("TESTE", "Headset unplugged");
                    break;
                case(1):
                    Log.i("TESTE", "Headset plugged");
                    break;
                default:
                    Log.i("TESTE", "Error");
            }

        }else{

            Log.i("TESTE","OUTROBROADCAST");
        }
        abortBroadcast();

    }
}