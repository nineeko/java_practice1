package com.ohgiraffers.section04.interfacesegregation.resolved;

public class BasicPrinter implements PrintOnly {

    @Override
    public void print() {
        System.out.println("구식 프린트기가 프린트합니다.");
    }
}
