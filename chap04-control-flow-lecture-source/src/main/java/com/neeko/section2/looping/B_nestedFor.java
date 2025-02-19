package com.neeko.section2.looping;

import java.util.Scanner;

public class B_nestedFor {
    public void printGugudanFromTwoToNine(){
        for(int i = 2; i<=9; i++){
            System.out.println("===== "+i+"단 =====");
            for(int j = 1; j<=9; j++){
                System.out.println(i+" X "+j+" = "+(i * j));
            }
        }
    }
    public void printTriangleStar(){
        /* 입력 받은 정수만큼 한 행에 '*' 행의 번호개씩 출력하기
        예 ) 5
        *
        **
        ***
        ****
        *****
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("출력하고 싶은 행의 값을 입력하세요. : ");
        int num = sc.nextInt();
        for(int i = 1; i<=num; i++){
            System.out.print("\n");
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
        }
    }
}
