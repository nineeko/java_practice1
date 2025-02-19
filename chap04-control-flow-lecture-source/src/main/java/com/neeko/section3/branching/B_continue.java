package com.neeko.section3.branching;

public class B_continue {
    public void testSimpleContinueStatement() {
        /* countinue 문에 대한 흐름을 이해하고 적용할 수 있다.*/
        /* 4의 배수 이면서 5의 배수 값 출력*/
        for(int i = 1; i <= 100; i++) {
            if(i%4!=0||i%5!=0) continue;
            System.out.println(i);
        }
    }
    public void testSimpleContinueStatement2() {
        /* 중첩 반복문 내 continue 사용에 대한 흐름을 이해하고 적용할 수 잇따.
        continue는 모든 반복문을 뛰어 넘는 것이 아니라 가장 인접한 반복문의 실행만 건너 뛴다.
         */
        label :
        for(int dan = 2; dan <=9; dan++) {
            System.out.println("===== " + dan+ "단 ======");
            for(int su = 1; su <=9; su++) {
                if(su % 2==0) continue label;
                System.out.println(dan + " * " + su + " = " + (dan * su));
                }
            }
            System.out.println();
        }

}
