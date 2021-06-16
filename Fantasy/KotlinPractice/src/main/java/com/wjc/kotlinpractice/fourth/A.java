package com.wjc.kotlinpractice.fourth;

import android.text.TextUtils;

/**
 * Created by wjc on 2021/5/30.
 */
public class A implements AInterface {
    public static A a = new A();

    public String getString(String string) {
        if (string == null || string.length() == 0) {
            return null;
        } else {
            return string;
        }
    }

    @Override
    public void putNumber(int a) {
        System.out.println("int");
    }

    @Override
    public void putNumber(Integer a) {
        System.out.println("Integer");
    }
}
