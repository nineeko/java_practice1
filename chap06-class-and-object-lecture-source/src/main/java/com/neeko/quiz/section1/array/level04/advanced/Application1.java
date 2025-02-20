package com.neeko.quiz.section1.array.level04.advanced;

import java.util.Random;
import java.util.Arrays;
import static java.lang.Math.random;

public class Application1 {
    public static void main(String[] args) {

        /* 로또번호 생성기
         * 6칸 짜리 정수 배열을 하나 생성하고
         * 1부터 45까지의 중복되지 않는 난수를 발생시켜 각 인덱스에 대입한 뒤
         * 오름차순 정렬하여 출력하세요.
         * Arrays.sort(배열) 메소드 활용하여 정렬 가능.
         * */

        int[] array = new int[6];

        for (int i = 0; i < array.length; i++) {
            array[i]=(int)(Math.random()*45)+1;
            for(int j=0;j<i;j++){
                if(array[j]==array[i]){
                    i--;
                break;}
            }
        }
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
        System.out.println(array[i]);}
    }
}
