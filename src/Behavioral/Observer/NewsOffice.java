package Behavioral.Observer;

import java.util.ArrayList;

public class NewsOffice {
    public static void main(String[] args) throws InterruptedException {
        Newspaper newspaper = new Newspaper(new String[]{"War in Ukraine !!!", "Ukraine force counterattack", "Putin is dead"});
        Subscriber sub1 = new Subscriber("Dimon");
        Subscriber sub2 = new Subscriber("Roman");
        Subscriber sub3 = new Subscriber("Oleksandr");
        Subscriber sub4 = new Subscriber("Sergiy");

        newspaper.addObserver(sub1);
        newspaper.addObserver(sub2);
        newspaper.addObserver(sub3);
        newspaper.addObserver(sub4);

        newspaper.notifyObservers();
        newspaper.removeObserver(sub1);
        Thread.sleep(5000);

        newspaper.addArticle("Ukraine wins");


    }
}
