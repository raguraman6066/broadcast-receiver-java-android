package com.example.broadcast_receiver_java_android;

import static android.content.Intent.ACTION_POWER_CONNECTED;
import static android.content.Intent.ACTION_POWER_DISCONNECTED;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.ImageView;

//anything happen in android system..like  change connect, headphone plugin, airplane mode on
//based on that we perform task in our app
public class MainActivity extends AppCompatActivity {
ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.imageView);
//broadcasts
        IntentFilter filter=new IntentFilter();
        filter.addAction(ACTION_POWER_CONNECTED);
        filter.addAction(ACTION_POWER_DISCONNECTED);

        registerReceiver(new PowerReceiver(imageView),filter);


    }
    //1.create broadcast receiver - receive the broadcast
    //register broadcast


    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(new PowerReceiver(imageView));
    }
}