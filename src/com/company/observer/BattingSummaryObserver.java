package com.company.observer;

public class BattingSummaryObserver implements Observer {
    @Override
    public void notifyObservers(MatchStatus status) {
        System.out.println("=========Batting summary===========");
        System.out.println("Batter 1 Name :" + status.batter1Name);
        System.out.println(" Batter 2 Name : "+status.batter2Name);
        System.out.println(" ");
    }
}
