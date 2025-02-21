package com.neeko.section02.superkeyword;

import java.util.Date;

public class Computer extends Product{
    private String cpu;
    private int ram;
    private int hdd;
    private String operatingSystem;


    public Computer() {
        super();

    }
    public Computer(String cpu, int ram, int hdd, String operatingSystem) {
        super();
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;

    }

    public Computer(String code, String name, String brand,int price, Date manufacturingDate, String cpu, int ram, int hdd, String operatingSystem) {
        super(code, name, brand, price, manufacturingDate);
        /*위에 작성된 생성자를 this()로 호출한다는 것은 super()를 두 번 호출하는 것과 같으므로
        * 허용되지 않는다.*/
        //this(cpu, ram, hdd, operatingSystem); // 오류 : 생성자를 두번 호출하게 됨
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
        this.operatingSystem = operatingSystem;
    }
    /* 부모 필드에 직접 접근은 불가능하지만 getter, setter 메소드는 자신의 것처럼 사용 가능 하므로
    * 자식 클래스에서 추가된 필드에 대해서만 getter, setter를 작성한다.*/
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    @Override
    public String getInformation(){
        /* super.getCode() ,  this.getCode() 등으로 부모 속성 필드에 접근 가능하다.
        * 단, this.getInformation()으로 작성하면 문제가 생길 수 있으므로 유의한다.*/
       return super.getInformation() +" " + cpu +" " + ram + " " + hdd + " " + operatingSystem;
    }
}
