@file:JvmName("Top")
package com.wjc.kotlinpractice.third

/**
 * Created by wjc on 2021/5/30.
 * kotlin中可以直接在文件中创建方法，相当于java中的static方法
 */
const val name = "wjc"
fun echo(name: String) {
    println("我是一个static方法")
}