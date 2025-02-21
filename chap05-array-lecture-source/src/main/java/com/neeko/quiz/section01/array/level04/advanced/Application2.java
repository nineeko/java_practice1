package com.neeko.quiz.section01.array.level04.advanced;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 숫자 야구게임 만들기
         * 길이 4의 정수 배열을 만들고 각 인덱스에는 0 ~ 9까지의 중복되지 않는 난수를 저장한다.
         * 4자리 숫자를 입력받아 스트라이크, 볼 등의 힌트를 주며 4자리 난수 숫자를 맞추는 게임이다.
         * 숫자와 자리가 모두 맞는 경우 스트라이크, 숫자는 맞지만 자리는 맞지 않는 경우는 볼 이다.
         * 예) 9183 으로 난수가 발생하면 9356 입력 시 1S 1B이다.
         *
         * 단, 기회는 총 10번이며, 10번 이내에 맞추는 경우 "정답입니다." 출력 후 게임 종료
         * 10번의 기회가 모두 소진 되면 "10번의 기회를 모두 소진하셨습니다. 프로그램을 종료합니다." 출력 후 종료
         *
         * 또한 4자리의 정수를 입력하지 않은 경우에는 "4자리의 정수를 입력해야 합니다." 출력 후 입력을 다시 받을 수 있되
         * 횟수는 차감하지 않는다.
         *
         * -- 프로그램 예시 (난수 7416 의 경우) --
         *
         * 10회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 1234
         * 아쉽네요 0S 2B 입니다.
         * 9회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 5678
         * 아쉽네요 0S 2B 입니다.
         * 8회 남으셨습니다.
         * 4자리 숫자를 입력하세요 : 7416
         * 정답입니다.
         * */
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

                if(userInput.length() != 4) {
                    System.out.println("4자리의 정수를 입력해야 합니다."); continue;}
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
