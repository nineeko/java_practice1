package com.neeko.section03.filterstream;


import java.io.Serializable;
/* 객체 입출력 처리를 위해서는 반드시 직렬화 처리를 해야한다.
* 직렬화 대상 클래스에 Serializable 인터페이스만 구현하면 데이터 직렬화 처리가 가능하다. */
public class Member implements Serializable{
    private String id;
    private String pwd;
    /* 직렬화에서 해당 필드를 제외하겠다는 의미의 키워드 */
    private transient int age;
    private char gender;

    public Member(String id, String pwd, int age, char gender) {
        this.id = id;
        this.pwd = pwd;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id='" + id + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
