package com.major.base;

import android.util.Log;

/**
 * Desc: TODO
 * <p>
 * Author: meijie
 * PackageName: com.major.base
 * ProjectName: ModulesDemo
 * Date: 2018/10/22 17:30
 */
public class SL {

    private static final String TAG = "tag_sl";

    public static void i(String msg){
        Log.i(TAG, msg);
    }
    public static void w(String msg){
        Log.w(TAG, msg);
    }
    public static void e(String msg){
        Log.e(TAG, msg);
    }


}
