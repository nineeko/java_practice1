package com.neeko.section1.extend;

public class FireCar extends Car {
    /* Car 클래스의 모든 멤버 ( 필드, 메소드)를 상속 받을 수 있다.
    * 단, 생성자는 상속 받지 못한다.*/

    public FireCar() {
        /* 모든 생성자에는 맨 첫 줄에 super() 를 컴파일러가 자동으로 추가한다.
        * 부모의 기본 생성자를 호출하는 구문으로 명시적 or 묵시적으로 사용가능하다.*/
        super();
        System.out.println("Fire Car 클래스 기본 생성자 호출");


    }

    /* soundHorn 메소드 재작성 : overriding
    * @override 어노테이션 :  오버라이딩 성립 요건을 체크하여 성립 되지 않는 경우 컴파일 에러 발생*/
    @Override
    /* soundHorn 메소드 재작성 : overriding */
    public void soundHorn(){

        if(isRunning()){
            System.out.println("빠아아아앙~!!! 빠아아아앙~!!!");
        }else
            System.out.println("주행 중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
    }
    /* 상속은 자식 클래스가 부모 클래스를 확장하는 것 이므로 FireCar 만의 추가 기능도 작성 가능하다.*/
    public void sprayWater(){
        System.out.println("물을 뿌립니다 ===============>>>>>>>");
    }

}
