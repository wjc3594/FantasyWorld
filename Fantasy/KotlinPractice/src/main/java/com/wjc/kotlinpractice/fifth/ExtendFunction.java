package com.wjc.kotlinpractice.fifth;

import java.io.File;

import kotlin.io.FilesKt;
import kotlin.text.Charsets;

/**
 * Created by wjc on 2021/5/30.
 */
class ExtendFunction {
    public static void main(String[] args) {
        File file = new File(".idea/misc.xml");
        //java调用kotlin扩展函数时，第一个参数需要传扩展的类的对象
        System.out.println(FilesKt.readText(file, Charsets.UTF_8));
    }
}
