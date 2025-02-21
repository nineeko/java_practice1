package com.neeko.quiz.section02.dimensional_array.level03.hard;

import java.util.Scanner;

public class application1 {
    public static void main(String[] args) {
        /* 가로와 세로 길이를 정수형으로 입력 받아
         * 입력받은 가로 세로 길이를 이용하여 이차원 배열을 할당하고
         * 각 인덱스에는 랜덤으로 알파벳 대문자 넣어서 출력
         *
         * 단, 가로 행 혹은 세로 열은 반드시 1~10 까지의 정수를 입력해야 하고
         * 그렇지 않은 경우에는 "반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요." 출력 후
         * 가로 행 또는 세로 열을 다시 입력받을 수 있도록 한다.
         *
         * -- 입력 예시 --
         * 가로 행의 수를 입력하세요 : 5
         * 세로 열의 수를 입력하세요 : 4
         *
         * -- 출력 예시 --
         * F H Z G
         * W F O T
         * O R X V
         * W H J X
         * W S S J
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("세로 행의 수를 입력하세요 :  \n");
        int x = sc.nextInt();
        while(!(1<=x && x<=10)){
            System.out.print("반드시 1~10까지 정수를 입력해야 합니다. 다시 입력하세요: ");
            x = sc.nextInt();
        }
        System.out.print("가로 열의 수를 입력하세요: ");
        int y = sc.nextInt();
        while(!(1<=y && y<=10)){
            System.out.print("반드시 1~10까지 정수를 입력해야 합니다. 다시 입력하세요: ");
            y = sc.nextInt();
        }
        int count =26;
        char[][]  array = new char[x][y];
        int[] alphabet = new int[x*y];
        for(int i = 0; i < x*y; i++){
                alphabet [i]= (int)(Math.random()*26)+65;
        }

        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){


                array[i][j] = (char)(alphabet[26-count]);
                count--;

            }
        }
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j]+" ");
            }System.out.println(" ");
        }
    }
}
