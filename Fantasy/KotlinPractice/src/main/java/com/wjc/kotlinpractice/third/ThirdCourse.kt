package com.wjc.kotlinpractice.third

import kotlin.reflect.KClass

/**
 * Created by wjc on 2021/5/30.
 * 极客时间第三节课：kotlin与java互调
 */
class ThirdCourse {
    private val catalogueOne = "语法变化"
    private val catalogueTwo = "Kotlin关键字处理"
    private val catalogueThree = "基本数据类型的处理"
    companion object{
        fun echo(name: String) {
            println("顶层方法名或变量名与kotlin类中定义的方法或变量重复时怎么办才能调用顶层的方法或变量呢")
        }
        //传入java clazz
        fun testClazz(clazz: Class<ThirdTestJava>){
            println(clazz.simpleName)
        }
        //传入kotlin clazz
        fun testClazz(clazz: KClass<ThirdCourse>){
            println(clazz.simpleName)
        }

        fun testClazza(clazz: Class<ThirdCourse>) {
            println(clazz.simpleName)
        }
    }
}

fun main() {
    //调用顶层方法和属性
    echo(name)
    //调用单例类
    ThirdDanLi.sayMess()
    //调用伴生对象的方法
    ThirdCourse.echo("dfa")
    //kotlin中调用java中定义的'in'变量（与kotlin关键字重复)
    println(ThirdTestJava.`in`)
    //打印kotlin clazz类名
    ThirdCourse.testClazz(
        ThirdCourse::class
    )
    //打印java clazz名字
    ThirdCourse.testClazz(
        ThirdTestJava::class.java
    )
}
