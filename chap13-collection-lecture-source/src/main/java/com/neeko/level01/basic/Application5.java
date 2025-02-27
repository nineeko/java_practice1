package com.neeko.level01.basic;

import java.util.Scanner;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> tset =new TreeSet<>();
        while (true) {
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            String word = scanner.nextLine();

            if(word.equalsIgnoreCase("exit")) {
                break;
            }else {
                tset.add(word);
            }

        }
        System.out.println("정렬된 단어 : "+tset);

    }
}
