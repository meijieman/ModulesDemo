package com.major.modulesdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.major.base.SL;
import com.major.interfaces.FuncA;
import com.major.interfaces.FuncB;
import com.major.interfaces.FuncC;
import com.major.platform.Proxy;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SL.i("初始化");
        FuncA funcA = Proxy.getFuncA();
        funcA.doWork();
        String str = funcA.getStr(2);
        SL.w("返回值 " + str);


        FuncB<String> funcB = Proxy.getFuncB("alpha", "beta");
        funcB.setCallback(new FuncB.Listener<String>() {
            @Override
            public void onFinish(List<String> t) {

            }
        });
        List<String> list = funcB.setData("");


        FuncC funcC = Proxy.getFuncC();
        if (funcC != null) {
            funcC.calc(2, 3, null);
        }
    }
}
