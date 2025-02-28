package com.neeko.section02.uses.subsection03.terminal;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Application2 {
    public static void main(String[] args) {
        /* 스트림의 최종 연산 중 하나인 reduce에 대해 이해하고 사용할 수 있다.
        * 이전 연산에서 반환된 값이 다음 연산의 첫 번째 인자로 전달된다. */
        OptionalInt reduceOneParam =
                IntStream.rangeClosed(1, 10)
                        .reduce((a, b)->{
                            System.out.println("a : "+a+", b : "+b);
//                            return Integer.sum(a,b);
                            return Integer.min(a,b);
        });
        System.out.println("reduceOneParam: "+reduceOneParam);
        /* 인자를 2개 전달하는 경우 첫 번째 인자가 초기 값으로 기능한다.
        * 결과 값이 반드시 존재하므로 OptionalInt가 아닌 int로 반환 값이 설정되어 있다. */
        int reduceTwoParam = IntStream.rangeClosed(1,10).reduce(100, Integer::sum);
        System.out.println("reduceTwoParam: "+reduceTwoParam);
    }

}
