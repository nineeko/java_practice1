package com.neeko.section1.method;

public class Application3 {
    public static void main(String[] args) {
        /*전달 인자(argument)와 매개변수(parameter)에 대해 이해하고 메소드 호출 시 사용 할 수 있다.
        * 리터럴, 변수, 연산한 결과 등을 모두 전달 인자로 사용할 수 있다. */
        Application3 application3 = new Application3();
        application3.testMethod(4);
        application3.testMethod(40);
        application3.testMethod(30);
        int age = 10;
        application3.testMethod(age);
        application3.testMethod(age*5);
        byte byteAge =10;
        application3.testMethod(byteAge);
//        long longAge =100L;
//        application3.testMethod(longAge);

        application3.testMethod2("채은",25,'여');
    }
    /* int 타입의 매개변수 (parameter)를 전달 받는 메소드 선언 */
    public void testMethod(int age) {

        System.out.println("당신의 나이는 "+ age + "세 입니다.");
    }
    public void testMethod2(String name, int age, final char gender) {
        /* 매개 변수도 일종의 지역변수(local variable)이다.
        * 단, 상수 네이밍 규칙을 선택적으로 따르는 경향이 있다.*/
        name ="홍길동";
        age = 20;
            //gender = '여';
        System.out.println("당신의 이름은 " + name + "이고, 나이는 "+ age + "세이며 " + "성별은 "+ gender+"입니다.");
    }
}
