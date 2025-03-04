package com.ohgiraffers.section02.openclosed.resolved;

/* Payment 인터페이스를 통해 새로운 결제 수단을 기존 코드 수정없이 쉽게 추가할 수 있다.
* PaymentProcessor 클래스는 구체적인 결제 방식을 알 필요없이 Payment 인터페이스에만 의존한다.   */
public class Application {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(new KakaoPayment());
        processor.processPayment(new CreditPayment());
    }
}
