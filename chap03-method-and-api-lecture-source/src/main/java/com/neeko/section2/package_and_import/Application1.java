package com.neeko.section2.package_and_import;
//import com.neeko.section1.method.Calculator;

public class Application1 {
    public static void main(String[] args) {
        /*클래스명은 원래 패키지명을 포함하고 있으며
        * 다른 패키지에 존재하는 클래스를 사용하는 경우 풀 클래스명을 사용해야한다.*/
        com.neeko.section1.method.Calculator calculator
                = new  com.neeko.section1.method.Calculator();
        System.out.println(calculator.min(10, 3));
    }
}
