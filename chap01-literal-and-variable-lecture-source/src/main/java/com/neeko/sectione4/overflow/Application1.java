package com.neeko.sectione4.overflow;

public class Application1 {
    public static void main(String[] args) {
        /* 오버 플로우에 대해 이해할 수 있다. */
        byte num1 = 127;
        System.out.println("num1 = " + num1);
        num1++;
        System.out.println("num1 = " + num1);

        /* 언더 플로우 */
        byte num2 = -128;
        System.out.println("num2 = " + num2);
        num2--;
        System.out.println("num2 = " + num2);

        int firstNum = 1000000;
        int secondNum = 700000;
        int multiNum = firstNum * secondNum;
        System.out.println("multiNum = " + multiNum);

        long multiNum2 = (long)firstNum * secondNum;
        System.out.println("multiNum2 = " + multiNum2);
    }
}
