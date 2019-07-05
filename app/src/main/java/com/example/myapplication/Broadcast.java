/*
package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

public class Broadcast extends BroadcastReceiver {
    private String TAG = "HeadSet";
    public Broadcast()
    {super();
    }

    @Override
    public void onReceive(Context context, Intent intent) {


        KeyEvent event2 = (KeyEvent) intent.getParcelableExtra(Intent.EXTRA_KEY_EVENT);

        if(event2 != null) {
            int keyAction = event2.getAction();
            Toast.makeText(context, "FLAG: " + event2.getFlags() + event2.getKeyCode() +event2.getRepeatCount(), Toast.LENGTH_LONG).show();
            Toast.makeText(context, "FLAG: " + event2.getDownTime() +event2.getRepeatCount(), Toast.LENGTH_LONG).show();
            if ((event2.getFlags() & KeyEvent.FLAG_LONG_PRESS) != 0) {
                if (event2.getRepeatCount() == 0) {
                    // initial down
                    Toast.makeText(context, "DEU: ", Toast.LENGTH_LONG).show();
                }
            }

        }
        if(intent.getAction().equals(Intent.ACTION_MEDIA_BUTTON)) {


            KeyEvent event = (KeyEvent) intent.getParcelableExtra(Intent.EXTRA_KEY_EVENT);



            if (event == null) {
                Toast.makeText(context,"teste null ",Toast.LENGTH_LONG).show();
                return;

            }

            Toast.makeText(context, "NUMERO: " + event.getKeyCode(), Toast.LENGTH_LONG).show();

            int action = event.getAction();

            if (action == KeyEvent.ACTION_DOWN) {
                // do something
                Toast.makeText(context, "BUTTON PRESSED DOWN!", Toast.LENGTH_SHORT).show();
                  Log.i("TESTE ACTION", intent.getAction());

                if(action == KeyEvent.KEYCODE_VOICE_ASSIST){
                    Toast.makeText(context, "BUTTON PRESSED VOICE!", Toast.LENGTH_SHORT).show();
                }

                if(event.getFlags() == KeyEvent.FLAG_LONG_PRESS){
                    Toast.makeText(context, "BUTTON PRESSED LONG!", Toast.LENGTH_SHORT).show();
                }

            }
            if(action == KeyEvent.ACTION_UP){
                Toast.makeText(context, "BUTTON PRESSED up!", Toast.LENGTH_SHORT).show();
            }




            // do something
            if (action == KeyEvent.KEYCODE_MEDIA_PLAY_PAUSE) {
                Toast.makeText(context, "Play Pause pressed!", Toast.LENGTH_SHORT).show();

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


}*/
