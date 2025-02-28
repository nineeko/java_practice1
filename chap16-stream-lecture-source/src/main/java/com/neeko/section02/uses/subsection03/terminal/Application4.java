package com.neeko.section02.uses.subsection03.terminal;

import java.util.Arrays;
import java.util.List;

public class Application4 {
    public static void main(String[] args) {
        /* 최종 연산 중 하나인 match에 대해 이해하고 사용할 수 있다. */
        List<String> stringList = Arrays.asList("java", "Spring", "SpringBoot");

        boolean anyMath =stringList.stream().anyMatch(s->s.contains("B"));
        boolean allMath =stringList.stream().allMatch(s->s.length()>3);
        boolean noneMath =stringList.stream().noneMatch(s-> s.contains("z"));

        System.out.println("anyMath = " + anyMath);
        System.out.println("allMath = " + allMath);
        System.out.println("noneMath = " + noneMath);

    }
}
