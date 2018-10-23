package com.major.platform.biz;

import com.major.base.SL;
import com.major.interfaces.FuncC;

/**
 * Desc: TODO
 * <p>
 * Author: meijie
 * PackageName: com.major.platform.biz
 * ProjectName: ModulesDemo
 * Date: 2018/10/22 17:37
 */
public class Func3 implements FuncC {

    // FIXME: 2018/10/22 Python 操作符？
    @Override
    public <T> void calc(T a, T b, FuncC funcC) {

        if (funcC != null) {
            funcC.calc(a, b, null);
        } else {
            if (a instanceof Integer && b instanceof Integer) {
                int result = ((Integer) a) + ((Integer) b);
                SL.i("result " + result);
            } else {
                SL.i("not realize");
            }
        }
    }
}
