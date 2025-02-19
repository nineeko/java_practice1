package com.neeko.section01.conditional.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        /* 영업사원의 월급을 계산하는 프로그램을 작성하려고 합니다.
         * 월 급여액과 월 매출액을 입력 받아 급여를 산정합니다.
         * 영업사원은 매출액 대비 보너스율에 명시된 보너스를 급여 외에 추가로 지급받습니다.
         *
         * 단, 보너스율은 입력 받은 월 매출액에 비례하며,
         * 계산된 보너스 금액을 월 급여액에 더하여 총 급여를 계산한다.
         *
         * 보너스율을 적용하여 출력 예시처럼 출력되도록 프로그램을 만들어보세요
         *
         * -- 총 급여 계산식 --
         * 총 급여 = 월 급여  + (매출액 * 보너스율)
         *
         * -- 매출액 대비 보너스율 --
         *   매출액       보너스율
         * 5천만원 이상      5%
         * 3천만원 이상      3%
         * 1천만원 이상      1%
         * 1천만원 미만      0%
         *
         * -- 입력 예시 --
         * 월 급여 입력 : 3000000
         * 매출액 입력 : 20000000
         *
         * -- 출력 예시 --
         * ======================
         * 매출액 : 20000000
         * 보너스율 : 1%
         * 월 급여 : 3000000
         * 보너스 금액 : 200000
         * ======================
         * 총 급여 : 3200000
         * */

        Scanner in = new Scanner(System.in);
        System.out.print("월 급여액을 입력하세요: ");
        int salary = in.nextInt();
        System.out.print("월 매출액을 입력하세요: ");
        int month_selling = in.nextInt();
        double sum =0;
        double bonus =0;
        double bonus_price =0;
        if(month_selling<10000000){
            sum = salary * 1.0;

        }else if(month_selling>=10000000){

            bonus = 1;
            bonus_price = month_selling * 0.01;
            sum = salary + bonus_price;
        }else if(month_selling>=30000000){

            bonus = 3;
            bonus_price = month_selling * 0.03;
            sum = salary + bonus_price;
        }else if(month_selling>=50000000){
            bonus = 5;
            bonus_price = month_selling * 0.05;
            sum = salary + bonus_price;
        }
        System.out.println("==========");
        System.out.println("매출액 : "+ month_selling);
        System.out.println("보너스율 : "+ bonus + "%");
        System.out.println("월 급여 : "+ salary);
        System.out.println("보너스 금액: "+ bonus_price);
        System.out.println("==========");
        System.out.println("총 급여 : "+sum);
    }
}
