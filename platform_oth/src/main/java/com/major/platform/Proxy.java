package com.major.platform;

import android.support.annotation.NonNull;

import com.major.interfaces.FuncA;
import com.major.interfaces.FuncB;
import com.major.interfaces.FuncC;
import com.major.platformoth.Func1;
import com.major.platformoth.FuncBBB;
import com.major.platformoth.FuncCCC;

/**
 * Desc: TODO
 * <p>
 * Author: meijie
 * PackageName: com.major.platform
 * ProjectName: ModulesDemo
 * Date: 2018/10/22 18:06
 */
public class Proxy {

    public static @NonNull FuncA getFuncA() {
        return new Func1();
    }


    public static @NonNull FuncB getFuncB(String param1, String param2) {
        return new FuncBBB();
    }

    public static @NonNull FuncC getFuncC() {
        return new FuncCCC();
    }

}
