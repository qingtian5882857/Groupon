package com.qingtian.qq.groupon.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.qingtian.qq.groupon.constant.Myconfig;

/**
 * Created by Administrator on 2017/6/15 0015.
 */

public class GSPUtil {
    SharedPreferences sp;
    //通过构造器重载，以不同的方式来获得偏好设置
    public GSPUtil(Context context,String name){
        sp =context.getSharedPreferences(name,Context.MODE_PRIVATE);
    }
    public GSPUtil(Context context){
        sp = PreferenceManager.getDefaultSharedPreferences(context);
    }
    public  boolean isFirst(){

        return sp.getBoolean(Myconfig.FIRST,true);
    }
    public void setFirst(boolean flag){
        SharedPreferences.Editor editor = sp.edit();
        editor.putBoolean(Myconfig.FIRST,flag);
        editor.commit();
    }
}
