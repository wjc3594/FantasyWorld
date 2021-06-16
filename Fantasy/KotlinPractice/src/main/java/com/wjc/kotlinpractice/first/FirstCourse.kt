package com.wjc.kotlinpractice.first

/**
 * Created by wjc on 2021/5/30.
 * 极客时间第一节课：kotlin快速上手开发
 */
class FirstCourse {
    //课程主要内容
    private val canLearnOne = "快速学会Kotlin的使用"
    private val canLearnTwo = "深入了解Kotlin"
    private val canLearnThree = "解决旧项目迁移问题"

    //下面要学的主要内容
    private val fastLearnOne = "Kotlin基础语法"
    private val fastLearnTwo = "与java互操作"
    private val fastLearnThree = "新手易碰到的问题"

    //输入课程主要内容
    fun totalMainContent() {
        println(
            "1、$canLearnOne\n" +
                    "2、$canLearnTwo\n" +
                    "3、$canLearnThree\n"
        )
    }

    //输出下一节课程主要内容
    fun nextCourseContent() {
        println(
            "1、$fastLearnOne\n" +
                    "2、$fastLearnTwo\n" +
                    "3、$fastLearnThree\n"
        )
    }

    //第一节学习评价
    fun firstCourseComment() {
        println("Good!!Please start next course")
    }

}

/** 我是main入口函数 **/
fun main() {
    val firstCourse = FirstCourse();
    firstCourse.totalMainContent()
    firstCourse.nextCourseContent()
    firstCourse.firstCourseComment()
}