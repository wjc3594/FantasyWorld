package com.wjc.kotlinpractice.fifth

import com.wjc.kotlinpractice.fifth.FifthCourse.echo2
import com.wjc.kotlinpractice.fifth.FifthCourse.nestFunction
import com.wjc.kotlinpractice.third.echo
import java.io.File

/**
 * Created by wjc on 2021/5/30.
 * 极客时间第五节课：函数与lambda闭包
 * 1、函数的特性语法
 * 2、嵌套函数
 * 3、扩展函数
 * 4、Lambda闭包语法
 * 5、高阶函数
 * 6、内联函数
 */
object FifthCourse {
    //函数声明
    fun echo1(name: String) {
        println(name)
    }

    //函数允许参数有默认值
    fun echo2(name: String = "wjc") = println(name)
    fun nestFunction() {
        val str = "hello"

        //嵌套函数，仅使用在某些条件下触发递归的函数和不希望外部函数访问到的函数里
        fun say(count: Int = 10) {
            println(str)
            if (count > 0) {
                say(count - 1)
            }
        }
        say()
    }

}

fun main() {
    echo2()
    echo2("hello")
    nestFunction()
    //扩展函数:用在无法更改的三方库或类中，实质上是扩展其static方法
    val file = File(".idea/misc.xml")
    println(file.readText())
    val animal = Animal()
    animal.sex()
    println(animal.count)
    animal.count = 200
    println(animal.count)
}