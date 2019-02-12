package com.shengsheng.mobileplayer2.activity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MotionEvent;

import com.shengsheng.mobileplayer2.R;

public class SplashActivity extends Activity {
    private static final String TAG=SplashActivity.class.getSimpleName();
    private Handler handler=new Handler();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //延迟两秒才执行到这里
                //执行在主线程中
                startMainActivity();
                Log.e(TAG,"当前线程的名称=="+Thread.currentThread().getName());
            }
        },2000);
    }
    /*
    * 跳转到主页面，并且关闭当前页面
    * */
    private void startMainActivity()
    {
        Intent intent=new Intent(this,MainActivity.class);
        startActivity(intent);
        //关闭当前页面
        finish();
    }
    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        Log.e(TAG,"onTouchEvent==Action"+event.getAction());
        startMainActivity();
        startMainActivity();
        return super.onTouchEvent(event);
    }
    @Override
    protected void onDestroy()
    {
        handler.removeCallbacksAndMessages(null );
        super.onDestroy();
    }
}
