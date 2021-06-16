package com.wjc.kotlinpractice.fourth

/**
 * Created by wjc on 2021/5/30.
 * 极客时间第四节课：新手使用kotlin常碰到的问题
 * 1、Kotlin没有封装类
 * 2、Kotlin类型空值敏感
 * 3、Kotlin没有静态变量与静态方法
 */
class FourthCourse : AInterface {
    override fun putNumber(a: Int) {
        println("int")
    }

//    override fun putNumber(a: Int?) {
//        TODO("Not yet implemented")
//    }
}

fun main() {
    //1、kotlin没有封装类，只有基本类型
    A.a.putNumber(123)
    val fourthCourse = FourthCourse()
    fourthCourse.putNumber(123)
    /**
     * 2、Kotlin类型空值敏感
     * 2.1 接收java方法传回的值默认是过渡类型String!,即还是java类型的String，可能为空，编译不报错
     * 2.2 会报错
     * 2.3 不会报错
     * 总结：当你接收一个java对象时，如果不确定是否为空，应该赋值给一个可空的变量，这样才能保证代码是安全的
     */
    val a1 = A.a.getString("")
//    val a2: String = A.a.getString("")
    val a3: String? = A.a.getString("")
    println(a3?.length)
    //练习题
    val age=18
    val name="wjc"
    println("我叫$name，我今年${age}岁")
}