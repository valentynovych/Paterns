package Behavioral.Observer;

import java.util.List;

public class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> articles) {
        System.out.println("Dear " + name + ": we`ve new articles in our newspaper\n" + articles + "\n");
    }

}
