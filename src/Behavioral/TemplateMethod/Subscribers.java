package Behavioral.TemplateMethod;

public class Subscribers extends MailTemplate {
    @Override
    protected void bodyMail() {
        System.out.println("<Body e-mail Subscribers>\n" +
                "Thanks for subscribers on our\n");
    }
}
