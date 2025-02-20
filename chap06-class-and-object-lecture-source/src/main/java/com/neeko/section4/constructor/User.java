package com.neeko.section4.constructor;

import java.util.Date;

public class User {
    /* 필드 선언부 */
    private String id;
    private String pwd;
    private String name;
    private Date enrollDate;

    /* 생성자 선언부
    * 접근제한자 클래스명 (매개변수){}
    */

    /* 기본 생성자
    * 클래스 내부에 작성된 생성자가 0개일 경우 컴파일러가 자동으로 기본 생성자를 생성한다. */
    public User(){
        System.out.println("User 기본 생성자 동작함");
    }
    /* 매개 변수 생성자
    * 초기화할 필드가 여러 개일 경우 초기화하고 싶은 필드의 조합별로 생성자를 여러 개 작성할 수 있다.*/
    public User(String id, String pwd){
        this.id = id;
        this.pwd = pwd;
        System.out.println("User id, pwd 초기화 생성자 동작함");
    }
    public User(String id, String pwd,String name, Date enrollDate){
//        this.id = id;
//        this.pwd = pwd;
        /*동일 클래스 내의 다른 생성자 메소드를 호출하는 구문
        * 리턴 되어 돌아오지만 리턴 값은 존재하지 않으며 가장 첫 줄에 선언해야 한다.*/
        this(id, pwd);
        this.name = name;
        this.enrollDate = enrollDate;
        System.out.println("User 모든 필드 초기화 생성자 동작함");
    }


    /* 메소드 선언부
     * 접근제한자 생성자명 (매개변수){
     * }
     */
    public String getInformation(){
        return id+" "+pwd+" "+name+" "+enrollDate;
    }



//
//
//    /* 3. id, pwd, name, enrollDate의 초기화를 담당할 생성자(모든 필드를 초기화 하는 생성자) */
//    public User(String id, String pwd, String name, java.util.Date enrollDate) {
//        this(id, pwd, name);
//        this.enrollDate = enrollDate;
//    }
//
//    /* 목차. 4. 복사 생성자 */
//    public User(User otherUser) {
//        this(otherUser.id, otherUser.pwd, otherUser.name, otherUser.enrollDate);
//    }
}
