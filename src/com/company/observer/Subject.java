package com.company.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o){
        observers.add(o);
    }

    public  void unSubscribe(Observer o){
        observers.remove(o);
    }

    public  void notifyAllObservers(MatchStatus status){

        for (Observer o: observers) {
            o.notifyObservers(status);
        }

    }


}
