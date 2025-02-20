package com.neeko.quiz.section1.array.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] array = new int[4];
        for (int i = 0; i < 4; i++) {
            array[i] = (int) (Math.random() * 10);


            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                    break;
                }
            }
        }

        // 난수 확인
        System.out.println("정답: " + array[0] + array[1] + array[2] + array[3]);

        for (int attempt = 1; attempt <= 10; attempt++) {
            System.out.println((11 - attempt) + "회 남으셨습니다.");

            int[] input = new int[4];

            while (true) {
                System.out.print("4자리 숫자를 입력하세요: ");
                String userInput = sc.next();


                for (int j = 0; j < 4; j++) {
                    input[j] = userInput.charAt(j) - '0';
                }
                break;
            }

            int strike = 0, ball = 0;
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    if (input[j] == array[k]) {
                        if (j == k) {
                            strike++;
                        } else {
                            ball++;
                        }
                    }
                }
            }

            if (strike == 4) {
                System.out.println("정답입니다!");
                System.exit(0);
            } else {
                System.out.println("아쉽네요 " + strike + "S " + ball + "B 입니다.");
            }
        }

        System.out.println("10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다.");
    }
}
