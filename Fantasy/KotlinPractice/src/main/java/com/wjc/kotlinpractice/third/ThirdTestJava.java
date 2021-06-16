package com.wjc.kotlinpractice.third;

/**
 * Created by wjc on 2021/5/30.
 * java中调用kotlin顶层方法和属性
 */
public class ThirdTestJava {
    public static String in = "in";
    private static void test(){
        Top.echo(Top.name);
    }
    public static void main(String[] args){
        test();
        //调用kotlin单例
        ThirdDanLi.sayMess();
        ThirdDanLi.INSTANCE.say(null);
        //调用kotlin伴生对象的方法
        ThirdCourse.Companion.echo("fdajlf");
        ThirdCourse.Companion.testClazza(ThirdCourse.class);
    }
}

