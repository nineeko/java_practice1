package com.neeko.level01.basic;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> studentIDs = new HashSet<>();

        while (true) {
            System.out.print("학생 ID 입력('exit' 입력 시 종료): ");
            String id = scanner.nextLine();

            if (id.equalsIgnoreCase("exit")) {
                break;
            } else if (studentIDs.contains(id)) {
                System.out.println("이미 등록 된 ID입니다.");
            } else {
                studentIDs.add(id);
                System.out.println("ID가 추가 되었습니다.");
            }
        }

        System.out.println("모든 학생의 ID : " + studentIDs);
        scanner.close();
    }
}

