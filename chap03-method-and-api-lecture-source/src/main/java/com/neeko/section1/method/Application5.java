package com.neeko.section1.method;

public class Application5 {
    public static void main(String[] args) {
    /* non-static 메소드 호출 */
        Application5 application5 = new Application5();
        System.out.println(application5.plus(10,20));
        System.out.println(application5.minus(10,20));
        System.out.println(minus(10,20));
    }

    public static int  plus(int a, int b) {
        return a + b;
    }
    public static int  minus(int a, int b) {
        return a - b;
    }
}
