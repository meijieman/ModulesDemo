package com.major.platform;

import com.major.interfaces.FuncB;

import java.util.List;

/**
 * Desc: TODO
 * <p>
 * Author: meijie
 * PackageName: com.major.platform
 * ProjectName: ModulesDemo
 * Date: 2018/10/22 17:21
 */
public class Func2 implements FuncB<String> {

    public Func2(String param1, String param2) {

    }

    @Override
    public List<String> setData(String data) {

        return null;
    }

    @Override
    public void setCallback(Listener<String> listener) {
        mListener = listener;
    }


    private Listener<String> mListener;
}
