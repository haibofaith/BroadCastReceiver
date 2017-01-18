package com.simple.broadcastdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/**
 * 静态订阅
 * */
public class MyReceiver extends BroadcastReceiver {
    private String ACTION= "Msg";
    public MyReceiver() {

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        Log.d("LOG", "进入了MyReceiver内部广播");
    }
}
