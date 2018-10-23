package com.major.platform;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.major.interfaces.FuncA;
import com.major.interfaces.FuncB;
import com.major.interfaces.FuncC;

/**
 * Desc: TODO
 * <p>
 * Author: meijie
 * PackageName: com.major.platform
 * ProjectName: ModulesDemo
 * Date: 2018/10/22 17:52
 */
public class Proxy {

    public static @NonNull FuncA getFuncA() {
        return new Func1();
    }

    public static @NonNull FuncB getFuncB(String param1, String param2) {
        return new Func2ExampleImpl();
    }

    public static @Nullable FuncC getFuncC() {
        return null;
    }
}
