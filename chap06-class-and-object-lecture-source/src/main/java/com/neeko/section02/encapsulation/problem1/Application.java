package com.neeko.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {
        /* 필드에 직접 접근하는 경우 발생할 수 있는 문제점을 해결한다.*/
        Monster m1 =new Monster();
        m1.name ="김태환";
        m1.hp= 200;
        System.out.println("m1.name = "+m1.name);
        System.out.println("m1.hp = "+m1.hp);

        Monster m2 =new Monster();
        m2.name ="이기연";
        m2.hp= -200;
        System.out.println("m1.name = "+m2.name);
        System.out.println("m1.hp = "+m2.hp);

        /* hp는 음수 값일 수 없다 => 필드에 올바르지 않은 값이 들어가도 통제 불가능
        * 직접 접근을 메소드를 통해 간접 접근할 수 있도록 수정해본다.
        * */
        Monster m3 =new Monster();
        m3.name ="드라큘라";
        m3.setHp(-200);
        System.out.println("m1.name = "+m3.name);
        System.out.println("m1.hp = "+m3.hp);
    }
}
