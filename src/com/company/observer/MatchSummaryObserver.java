package com.company.observer;

public class MatchSummaryObserver implements Observer {
    @Override
    public void notifyObservers(MatchStatus status) {
        System.out.println("=========Match summary===========");
        System.out.println("Current batting team is: "+status.currentBattingTeam);
        System.out.println(status.currentBattingTeam+" Score :" + status.team1Score);
        System.out.println(status.currentBattingTeam+" wickets : "+status.wickets);
        System.out.println(" ");
    }
}
