package com.wjc.kotlinpractice.fifth

/**
 * Created by wjc on 2021/5/30.
 * 扩展函数不具有多态性，只是被扩展类的静态方法，会被编译成public static final
 */
open class Animal

class Dog : Animal()

//扩展函数
fun Animal.name() = println("animal")
fun Animal.sex() = print("sex")
//扩展属性
var ab = 100
var Animal.count: Int
    get() {
        return ab - 90
    }
    set(value) {
        ab = value
    }

fun Dog.name() = println("dog")
fun test(animal: Animal) {
    animal.name()
}

fun main() {
    test(Dog())
}