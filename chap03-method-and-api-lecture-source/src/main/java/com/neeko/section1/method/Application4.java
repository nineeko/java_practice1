package com.neeko.section1.method;

public class Application4 {
    public static void main(String[] args) {
        /*메소드 리턴 값을 이해하고 활용할 수 있다. */
        Application4 application4 = new Application4();
        System.out.println(application4.testMethod());
    }
    /* String 타입의 값을 반환하는 메소드 선언 */
    public String testMethod() {
        return "Hello World";
    }
    /* 반환 값이 없는 메소드 */
    public void testMethod2() {
        /* 컴파일러가 자동으로 메소드의 맨 끝에 return 구문을 추가하기 때문에
        * 명시적으로 작성할 필요가 없다.
        * 다만 필요에 의해서 작성될 수도 있다. (조건문 사용 등)
         */
        return;
       // System.out.println("Hello World");
    }
}
