package com.ohgiraffers.section05.dependencyinversion.resolved;

public class NotificationService {
    /* 구체적인 구현체가 아닌 추상화된 인터페이스에 의존*/
    private final MessageSender MessageSender;

    /*의존 관계에 있는 객체를 생성자로 전달(의존성 주입)
    * 하위 구현체는 매번 다를 수 있다. */
    public NotificationService(MessageSender messageSender) {
        this.MessageSender = messageSender;
    }
    public void sendNotification(String message) {
        MessageSender.sendMessage(message);
    }
}
