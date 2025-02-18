package com.neeko.section05.typecasting;

public class Application4 {
    public static void main(String[] args) {
     /* 강제 형변환 시 데이터 손실이 발생할 수 있다. */
    int inum = 290;
    byte bnum = (byte) inum;

    System.out.println("inum = " + inum);
    System.out.println("bnum = " + bnum);

        double height = 175.5;
        int floorHeight = (int) height;

        System.out.println("height : " + height);
        System.out.println("floorHeight : " + floorHeight);		//소수점 절삭에 이용할 수 있다.
    }
}