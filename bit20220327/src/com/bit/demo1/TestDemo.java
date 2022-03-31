package com.bit.demo1;

/**
 * Created with IntelliJ IDEA.
 * Description: Hello,I would appreciate your comments~
 * User:
 * Date: -03-31
 * Destination:
 */
public class TestDemo {

    int a = 199;//成员变量
//    默认权限----》包访问权限
//    ---->只能在当前包中使用
    public int b = 999;
    private int c = 100;

    public static void main(String[] args){
        TestDemo testDemo = new TestDemo();
        System.out.println(testDemo.a);
        System.out.println(testDemo.b);
        System.out.println(testDemo.c);
//      在本类中都都可以访问到
    }

    public static void main1(String[] args) {


    }

}
