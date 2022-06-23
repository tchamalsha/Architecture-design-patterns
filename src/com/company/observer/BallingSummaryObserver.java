package com.company.observer;

public class BallingSummaryObserver implements Observer {
    @Override
    public void notifyObservers(MatchStatus status) {
        System.out.println("=========Balling summary===========");
        System.out.println("Baller Name :" + status.ballerName);
        System.out.println(" ");
    }
}
