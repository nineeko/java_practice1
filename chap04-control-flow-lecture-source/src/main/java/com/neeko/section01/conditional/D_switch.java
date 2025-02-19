package com.neeko.section01.conditional;

import java.util.Scanner;

public class D_switch {
    public void testSimpleSwitchStatement() {
        /* switch문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수: ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력 : ");
        char op = sc.next().charAt(0);
        int result = 0;

        switch(op){
            case '+' :
                result = first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*','X' :
                result = first * second;
                break;
            case '/' :
                result = first / second;			//second가 0이면 에러 발생(ArithmeticException)
                break;
            case '%' :
                result = first % second;
            /* case에서 일치 값을 찾지 못 할 경우 수행할 구문을 작성할 수 있다.*/
                break;
        }
        System.out.println(first + " " + op + " " + second + " = " + result);
    }

    public void improveSwitchStatement() {
        /* java 14부터 적용된 switch문 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수: ");
        int second = sc.nextInt();
        System.out.print("연산 기호 입력 : ");
        char op = sc.next().charAt(0);

        /* 2개 이상의 명령문을 작성해야 하는 경우 {}을 생략하지 못하고 작성해야함.
        * 반환 값을 yield라는 명령어를 작성하여 명시적으로 리턴함. */
        int result = switch(op){
            case '+' -> {
                System.out.println("더하기 연산자 실행");
                yield first + second;
            }

            case '-' -> first - second;

            case '*','X' -> first * second;

            case '/' -> first / second;			//second가 0이면 에러 발생(ArithmeticException)

            case '%' -> first % second;
            default -> 0;
        };
        System.out.println(first + " " + op + " " + second + " = " + result);
    }
}
