package com.example.broadcast_receiver_java_android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;

public class PowerReceiver extends BroadcastReceiver {
    ImageView imageView;

    public PowerReceiver(ImageView imageView) {
        this.imageView = imageView;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        switch (intent.getAction()){
            case Intent.ACTION_POWER_CONNECTED:
                imageView.setImageResource(R.drawable.baseline_battery_charging_full_24);
                break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    imageView.setImageResource(R.drawable.baseline_battery_alert_24);

                    break;
        }

    }
}