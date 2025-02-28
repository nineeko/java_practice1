package com.neeko.section03.reference;

import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Application1 {
    public static void main(String[] args) {

    /* 메소드 참조에 대해 이해하고 사용할 수 있다. */
        BiFunction<String, String, Boolean> biFunction;
        String str1 = "METHOD";
        String str2 = "METHO";

        biFunction = (x, y)-> x.equals(y);
        boolean result = biFunction.apply(str1, str2);
        System.out.println("result = " + result);
        /* 메서드 참조 버전*/
        biFunction = String::equals;
        result = biFunction.apply(str1, str2);
        System.out.println("result = " + result);

//        Predicate<String> isEqualsToSample;
        Predicate<String> isEqualsToSample;
        String sample = "hello world";

        isEqualsToSample = s -> s.equals(sample);
        result = isEqualsToSample.test("Hello World");
        System.out.println("result = " + result);

        isEqualsToSample = sample::equals;
        result = isEqualsToSample.test(sample);
        System.out.println("result = " + result);
    }


}
