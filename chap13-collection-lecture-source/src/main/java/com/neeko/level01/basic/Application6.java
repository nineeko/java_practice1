package com.neeko.level01.basic;

import java.util.HashMap;
import java.util.*;
public class Application6 {
    public static void main(String[] args) {
        /* HashMap*/
        HashMap map = new HashMap();
        Scanner scanner = new Scanner(System.in);
        String key = "";
        String value = "";
        while (true) {
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            } else if (input.equalsIgnoreCase("search")) {
                System.out.print("검색할 이름: ");
                String input1 = scanner.nextLine();
                if(map.containsKey(input1)) {
                System.out.println(input1+"씨의 전화번호: "+map.get(input1));}
                else {
                    System.out.println(input1+"씨의 번호는 등록되어 있지 않습니다.");
                }
                continue;
            }else {
            if (!input.contains(" ")) {
                System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");
                continue;
            }else {
            String[] values = input.split(" ");
                for (int i = 0; i < values.length; i++) {
                    key = values[0];
                    value = values[1];
                    map.put(key, value);

                }System.out.println("추가 완료 : "+ key+" "+value);
            }}
        }


    }

}
