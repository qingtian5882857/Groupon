package com.qingtian.qq.groupon.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.qingtian.qq.groupon.R;

import com.qingtian.qq.groupon.util.GSPUtil;

public class SplashActivity extends Activity {

    GSPUtil gsp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        gsp = new GSPUtil(this);
        //界面停留几秒钟
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //读取偏好设置文件中的值
                Intent intent;
                if(true){
                    //向新手指导页面跳转
                    intent = new Intent(SplashActivity.this,GreenhandActivity.class);
                    gsp.setFirst(false);
                }else{
                    intent = new Intent(SplashActivity.this,MainActivity.class);
                }
                startActivity(intent);
                finish();
            }
        },2000);
    }
}
