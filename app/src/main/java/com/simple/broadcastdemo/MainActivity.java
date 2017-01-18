package com.simple.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private String ACTION= "com.broadcast.mybroadcast";
    private BroadcastReceiver receiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerMyReceiver();
    }

    public void registerMyReceiver(){
        /**
         * MyReceiver2动态订阅
         * */
        IntentFilter filter = new IntentFilter();
        filter.addAction(ACTION);
        receiver = new MyReceiver2();
        registerReceiver(receiver, filter);
    }

    public void sendMsg(View view){
        Log.d("LOG", "MainActivity点击");
        Intent intent = new Intent();
        intent.setAction(ACTION);
        sendBroadcast(intent);
    }

    /**
     * 不写这个的话，动态注册会抛出异常
     * */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(receiver);
    }
}
