package com.neeko.level01.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> recentUrls = new LinkedList<>();
        final int MAX_SIZE = 5;

        while (true) {
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            String url = scanner.nextLine();

            if (url.equalsIgnoreCase("exit")) {
                break;
            }

            if (recentUrls.size() == MAX_SIZE) {
                recentUrls.removeLast();
            }
            recentUrls.addFirst(url);

            System.out.println("최근 방문 url : " + recentUrls);
        }

        scanner.close();
    }
}
