package com.neeko.section2.package_and_import;

import com.neeko.section1.method.Calculator;

import static com.neeko.section1.method.Calculator.max;
import static com.neeko.section1.method.Calculator.min;

public class Application2 {
    public static void main(String[] args) {
        /*클래스명은 원래 패키지명을 포함하고 있으며
        * improt 구문을 제공하고 있다.
        * import 구문은 package 선언과 class 선언 사이에 배치 된다.
        * 클래스명이 동일할 경우 import 시 유의해서 올바른 클래스를 import 하도록 한다.
        * alt + enter */
        Calculator calculator = new Calculator();
        System.out.println(max(10, 5));
        System.out.println(min(10, 5));
    }
}
