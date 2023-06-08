package Behavioral.TemplateMethod;

public class Notify extends MailTemplate {
    @Override
    protected void bodyMail() {
        System.out.println("<Body e-mail Notify>\n" +
                "In our newspaper have a new articles, please read her\n" +
                "bla bla bla....\n" +
                "bla bla ... \n");
    }
}
