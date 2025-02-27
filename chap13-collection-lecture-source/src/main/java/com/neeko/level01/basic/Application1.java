package com.neeko.level01.basic;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> scores = new ArrayList<>();
        String input;

        do {
            System.out.print("학생 성적 : ");
            int score = scanner.nextInt();
            scores.add(score);

            System.out.print("추가 입력하려면 y : ");
            input = scanner.next();
        } while (input.equalsIgnoreCase("y"));

        int totalStudents = scores.size();
        int sum = 0;


        for (int score : scores) {
            sum += score;
        }

        double average =  (double) sum / totalStudents;

        System.out.println("학생 인원 : " + totalStudents);
        System.out.printf("평균 점수 : %.1f\n", average);
    }
}
