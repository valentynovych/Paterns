package Behavioral.TemplateMethod;

public abstract class MailTemplate {
    public void buildMailPage() {
        System.out.println("<Header e-mail>\n" +
                "Hello my dear friend, are very pleased to inform you that ..." +
                "\n==================================\n");
        bodyMail();
        System.out.println("===================================\n" +
                "<Footer e-mail>\n" +
                "Good luck my friend\n\n");
    }

    abstract void bodyMail();
}
