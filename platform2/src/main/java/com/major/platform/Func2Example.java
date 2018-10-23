package com.major.platform;

import com.major.interfaces.FuncB;

import java.util.List;

/**
 * Desc: TODO
 * <p>
 * Author: meijie
 * PackageName: com.major.platform
 * ProjectName: ModulesDemo
 * Date: 2018/10/22 17:45
 */
abstract class Func2Example<S extends List> implements FuncB<S> {

    @Override
    public  List<S> setData(S data) {

        return null;
    }

    public abstract void extra();
}
