package com.neeko.section2.looping;

import java.util.Scanner;

public class C_while {
    public void testSimpleWhileStatement() {
        int i = 0;

        while (i<10){
            System.out.println(i);
            i++;
        }
    }
    public void testWhileExample(){
        /* 키보드로 문자열을 입력 받고 반복적으로 출력한다. (횟수 제한 X)
        단, exit 가 입력되면 반복 종료.
         */
        Scanner sc = new Scanner(System.in);
        String input = "";
        while (!input.equals("exit")){
            System.out.print("문자열을 입력하세요: ");
            input = sc.nextLine();
            System.out.println("입력 받은 값 : "+input);
        }
    }
    public void testSimpleDoWhileStatement() {
        do{
            System.out.println("조건이 false여도 최초 한 번은 무조건 동작함");
        }while(false);
    }
}
