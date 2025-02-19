package com.neeko.section2.looping;

import java.util.Scanner;

public class A_for {
    public void testSimpleForStatement() {
        for (int i = 0; i < 10; i++) {
            System.out.println("출력 : "+ i);

        }
    }
    public void testForExample() {
        /* 특정 값(1~100 사이의 난수)까지의 합계 구하기 */
        int random = (int) (Math.random() * 100)+1;
        int sum =0;
        for (int i = 0; i < random; i++) {
            sum += i;
        }
        System.out.println(random+"까지의 합계 : " + sum);
    }
    public void testForExample2() {
        /* 사용자에게 정수 2개를 입력받아 작은 값부터 큰 값 까지의 합계를 구한다. */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수: ");
        int first = sc.nextInt();
        System.out.print("두 번째 정수: ");
        int second = sc.nextInt();
        int sum = 0;
        int max = 0;
        int min =0;
        if(first > second) {
            max = first; min = second;
        }else {
            max = second; min = first;
        }

        for (int i=min; i<=max; i++) {
            sum = sum+i;
        }
        System.out.println("합계: " + sum);
    }

}
