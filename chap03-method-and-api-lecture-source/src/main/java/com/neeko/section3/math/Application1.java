package com.neeko.section3.math;

public class Application1 {
    public static void main(String[] args) {
        /* Math 클래스에서 제공하는 static 메소드를 호출할 수 있다. */
        /* import java.lang.*; 구문을 컴파일러가 자동으로 추가한다.
        * lang 패키지 하위에 있는 기능들이 기본적으로 많이 사용되는 기능이기 때문이다. */
        /* 1. 절대값 */
        System.out.println(Math.abs(-7));
        /* 2. 최솟값, 최댓값 */
        System.out.println(Math.min(10,5));
        System.out.println(Math.max(10,5));

        /* 3. 난수 출력 * 0에서 1사이의 소수가 나옴 */
        System.out.println(Math.random());
    }
}
