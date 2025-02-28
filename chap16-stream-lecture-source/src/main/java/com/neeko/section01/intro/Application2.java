package com.neeko.section01.intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림의 병렬 처리에 대해 이해할 수 있다. */
        List<String> list = new ArrayList<>(
                Arrays.asList("java","mariadb","html","css","mybatis")

        );
        System.out.println("for each ================");
        for(String s: list){
            System.out.println(s);
        }
        System.out.println("normal stream ============");
        list.stream().forEach(Application2::print);


        /* 병렬 스트림을 활용하면 처리해야 할 데이터 요소가 많을 경우
        * 효율적으로 처리할 수 있는 장점이 있다.*/
        System.out.println("parellel stream ============");
        list.parallelStream().forEach(Application2::print);
        list.parallelStream().forEach(Application2::print);

    }
    private static void print(String str) {
        System.out.println(str+ " : "+Thread.currentThread().getName());
    }
}
