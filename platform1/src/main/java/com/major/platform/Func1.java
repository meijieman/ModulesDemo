package com.major.platform;

import com.major.base.SL;
import com.major.interfaces.FuncA;

/**
 * Desc: TODO
 * <p>
 * Author: meijie
 * PackageName: com.major.platform
 * ProjectName: ModulesDemo
 * Date: 2018/10/22 17:02
 */
public class Func1 implements FuncA {

    @Override
    public void doWork() {
        SL.i("doWork: in platform1");
    }

    @Override
    public String getStr(int a) {
        return "platform1";
    }
}
