package com.wjc.kotlinpractice

import android.view.View

/**
 * Created by wjc on 2021/6/14.
 */
class KotlinClass(i:Int) :Lambda(i),View.OnClickListener{
    /**
     * kotlin中类如果继承其他类，在类名后加：后跟继承类的名字和()(默认构造函数）
     * 如果不显式继承其它类，默认继承Any，而不是Object
     * 接口和类无先后关系
     * 如果只有一个主构造函数，在类名后声明即可，如果有多个次构造函数，用constructor进行声明
     */
    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
    constructor(i:Int,j:Int):this(i){
        print(j)
    }
    init {
        //在构造函数中执行一些初始化代码
        print(i)
    }

}
fun main(){
    var k=KotlinClass(1)
}