package com.company.observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Observer matchSummaryObserver = new MatchSummaryObserver();
        Observer ballingSummaryObserver = new BallingSummaryObserver();
        Observer battingSummaryObserver = new BattingSummaryObserver();

        MatchStatus status = new MatchStatus();
        status.currentBattingTeam="Sri Lanka";
        status.ballerName="Devid wanner";
        status.batter2Name="Kusal Mendis";
        status.batter1Name="Wanidu Hasaranga";
        status.wickets=3;
        status.team1Score=67;

        Subject subject = new Subject();
        subject.subscribe(matchSummaryObserver);
        subject.subscribe(battingSummaryObserver);
        subject.subscribe(ballingSummaryObserver);
        subject.notifyAllObservers(status);

        Thread.sleep(6000);//small delay
        status.team1Score=89;
        status.wickets=5;
        subject.notifyAllObservers(status);
    }
}
