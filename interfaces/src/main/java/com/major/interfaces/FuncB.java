package com.major.interfaces;

import java.util.List;

/**
 * Desc: TODO
 * <p>
 * Author: meijie
 * PackageName: com.major.interfaces
 * ProjectName: ModulesDemo
 * Date: 2018/10/22 16:48
 */
public interface FuncB<D> {

    List<D> setData(D data);

    void setCallback(Listener<D> listener);

    interface Listener<T>{

        void onFinish(List<T> t);
    }
}
