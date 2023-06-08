package Behavioral.TemplateMethod;

public class MailClient {
    public static void main(String[] args) {
        MailTemplate notify = new Notify();
        MailTemplate subscribers = new Subscribers();

        notify.buildMailPage();
        subscribers.buildMailPage();
    }
}
