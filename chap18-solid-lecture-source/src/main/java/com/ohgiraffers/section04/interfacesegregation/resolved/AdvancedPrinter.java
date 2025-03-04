package com.ohgiraffers.section04.interfacesegregation.resolved;

public class AdvancedPrinter implements MultiFunctionPrinter {

    @Override
    public void print() {
        System.out.println("최신식 프린트기가 프린트합니다.");
    }

    @Override
    public void fax() {
        System.out.println("최신식 프린트기가 팩스를 보냅니다.");
    }

    @Override
    public void scan() {
        System.out.println("최신식 프린트기가 스캔합니다.");
    }

}
