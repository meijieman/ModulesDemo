package com.major.platform;

import com.major.interfaces.FuncA;
import com.major.interfaces.FuncB;
import com.major.interfaces.FuncC;
import com.major.platform.biz.Func3;

/**
 * Desc: 所有模块内的类通过这个类来获取， 且不同模块中这个类相对路径一致
 * <p>
 * Author: meijie
 * PackageName: com.major.platform
 * ProjectName: ModulesDemo
 * Date: 2018/10/22 17:16
 */
public final class Proxy {

    public static FuncA getFuncA(){
        return new Func1();
    }


    public static FuncB<String> getFuncB(String param1, String param2){
        return new Func2(param1, param2);
    }

    public static FuncC getFuncC(){
        return new Func3();
    }
}
