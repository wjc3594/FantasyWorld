package com.wjc.kotlinpractice.second

/**
 * Created by wjc on 2021/5/30.
 * 极客时间第二节课：kotlin最基础语法
 */
class SecondCourse {
    //kotlin变量命名规则：变量名在前，类型在后，而且可以推断类型
    var age: Int = 1
    val name: String = "wjc"

    //省去类型
    var age1 = 1
    val name1 = "wjc"

    /**
     * kotlin变量类型为空安全类型，都不会为空，如果不确定是否为空，在类型后加？
     * 注意Int和Int?是完全不同的类型
     */
    var age2: Int? = null

    //var表示一个可变的变量，val表示一个不可变的变量
    fun test() {
        age = 2
        age1 = 3
//        name="fdaf"  //会报错
        //不确定为空的变量可以为它赋值确定不为空的变量，反之不可以（如果非要赋值，可以在后面加'!!',表示不可能为空)
        age2 = age
//        age=age2
        age = age2!!
    }

    //kotlin方法
    fun print(str: String): String {
        println("$str")
        return str
    }

    //第二节学习评价
    fun secondCourseComment() {
        println("Nice!!Please start next course")
    }
}

fun main() {
    val secondCourse = SecondCourse()
    secondCourse.print("wjc")
    secondCourse.secondCourseComment()
}