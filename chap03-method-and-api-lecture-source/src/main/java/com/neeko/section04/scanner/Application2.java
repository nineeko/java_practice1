package com.neeko.section04.scanner;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* nextLine과 next 메소드의 차이를 알 수 있다. */
        Scanner scanner = new Scanner(System.in);
        /* 공백을 포함한 한 줄 입력을 위해 개행 문자 전까지 읽어서 문자열로 변환하는 메소드 */
        System.out.print("인사말 입력 : ");
        String greeting = scanner.nextLine();
        System.out.println("next line : "+greeting);
        /*공백 문자나 개행 문자 전까지 읽어서 문자열로 변환하는 메소드*/
        System.out.print("인사말 입력 : ");
        String greeting2 = scanner.next();
        System.out.println("next : "+greeting2);
    }
}
