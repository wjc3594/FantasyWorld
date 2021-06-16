package com.wjc.kotlinpractice.third

/**
 * Created by wjc on 2021/5/30.
 */
object ThirdDanLi {
    //加上这个注解，这个方法就变成一个静态方法了
    @JvmStatic
    fun sayMess() {
        println("我是一个静态方法")
    }

    fun say(str:String?) {
        println("我是一个单例类的方法:$str")
    }
}