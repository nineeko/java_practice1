package com.ohgiraffers.section05.dependencyinversion.resolved;

import javax.management.Notification;

/* NotificationService가 추상화된 MessageSender 인터페이스에 의존하고 있으며
* 구체적인 구현(EmailSender, SMSSender) 클래스는 이 인터페이스를 구현한다.
* 다름 발송 방식이 추가되어도 NotificationService 클래스의 코드는 영향 받지 않는다.*/
public class Application {
    public static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        MessageSender smsSender = new SMSSender();
        NotificationService n1 = new NotificationService(emailSender);
        NotificationService n2 =new NotificationService(smsSender);


        n1.sendNotification("이메일로 공지 발송");
        n2.sendNotification("sms로 공지 발송");
    }
}
