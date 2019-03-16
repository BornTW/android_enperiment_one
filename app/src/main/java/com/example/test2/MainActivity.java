package com.example.test2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Main2ActivityLife","Activity创建时调用 onCreate()");
    }

    protected void onStart() {
        super.onStart();
        // The activity is about to become visible.
        Log.i("Main2ActivityLife","Activity创建或者从后台重新回到前台时调用 onStart()");
        //Log.d("sffsd","onDestroy");
    }
    @Override
    protected void onResume() {
        super.onResume();
        // The activity has become visible (it is now "resumed").
        Log.i("Main2ActivityLife","Activity创建或者从被覆盖、后台重新回到前台时调用 onResume()");
    }
    @Override
    protected void onPause() {
        super.onPause();
        // Another activity is taking focus (this activity is about to be "paused").
        Log.i("Main2ActivityLife","Activity被覆盖到下面或者锁屏时调用 onPause()");
    }
    @Override
    protected void onStop() {
        super.onStop();
        // The activity is no longer visible (it is now "stopped")
        Log.i("Main2ActivityLife","退出当前Activity或者跳转到新Activity时调用 onStop())");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        // The activity is about to be destroyed.
        Log.i("Main2ActivityLife"," 退出当前Activity时被调用,调用之后Activity就结束了调用 onDestroy()");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Main2ActivityLife"," Activity从后台重新回到前台时调用 onDestroy()");
    }
}
