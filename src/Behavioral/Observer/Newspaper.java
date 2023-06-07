package Behavioral.Observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Newspaper implements Observable {
    private List<Observer> subscribers = new ArrayList<>();
    private List<String> articles = new ArrayList<>();

    public Newspaper(String[] articles) {
        this.articles.addAll(Arrays.asList(articles));
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        System.err.println(observer + " unsubscribe");
        subscribers.remove(observer);
    }

    public void addArticle(String article) {
            articles.add(article);
            notifyObservers();
    }
    public void removeArticle(String article){
        articles.remove(article);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Current subscribers: " + subscribers.size());
        for (Observer observer : subscribers){
            observer.handleEvent(articles);
        }
    }
}
