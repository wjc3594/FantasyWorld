package com.wjc.kotlinpractice

/**
 * Created by wjc on 2021/6/14.
 * lambda和高阶函数
 */
open class Lambda {
    constructor(i:Int)
    /**
     * 最多有22个参数，实际上是匿名内部类，不建议使用
     * 如果无参数，可省略->
     */
    val test = { a: Int,b:String,c:Int ->
        print(
            a
        )
    }

    /**
     * 高阶函数
     * 1、函数的参数是函数，格式：（）->返回类型{函数体}
     *
     */
    fun test1(isDebug:Boolean,a:Int,b: String,blo:(a:Int,b:String)->Int){
        if(isDebug) {
            print(blo(a,b))
        }
    }

    /**
     * 高阶函数
     * 1、inline 编译后直接变成语句的调用，减少临时变量的产生，而且编译工作量变大，不好排查问题
     *
     */
    inline fun test2(isDebug:Boolean,a:Int,b: String,blo:(a:Int,b:String)->Int){
        if(isDebug) {
            print(blo(a,b))
        }
    }
}
fun main(){
    val lambda=Lambda(1)
    lambda.test1(true,1,"a"){ i: Int, s: String ->
        print(
            s+i
        )
        return@test1 2
    }
    lambda.test2(true,1,"a"){ i: Int, s: String ->
        print(
            s+i
        )
        return@test2 2
    }
}