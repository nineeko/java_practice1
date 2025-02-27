package com.neeko.level01.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> waitingQueue = new LinkedList<>();

        while (true) {
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("next")) {
                if (waitingQueue.isEmpty()) {
                    System.out.println("대기 고객이 없습니다.");
                } else {
                    System.out.println(waitingQueue.poll() + " 고객님 차례입니다.");
                }
            } else {
                waitingQueue.offer(input);
                System.out.println(input + " 고객님 대기 등록 되었습니다.");
            }
        }


    }
}
