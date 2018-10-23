package com.major.platformoth;

import com.major.base.SL;
import com.major.interfaces.FuncA;

/**
 * Desc: TODO
 * <p>
 * Author: meijie
 * PackageName: com.major.platformoth
 * ProjectName: ModulesDemo
 * Date: 2018/10/22 18:04
 */
public class Func1 implements FuncA {

    @Override
    public void doWork() {
        SL.i("doWork: in platform other");
    }

    @Override
    public String getStr(int a) {
        return "platform other";
    }
}
