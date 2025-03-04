package com.ohgiraffers.section04.interfacesegregation.resolved;

public class Application {
    public static void main(String[] args) {
        PrintOnly printOnly = new BasicPrinter();
        printOnly.print();

        MultiFunctionPrinter multiFunctionPrinter = new AdvancedPrinter();
        multiFunctionPrinter.print();
        multiFunctionPrinter.fax();
        multiFunctionPrinter.scan();

    }
}
