package com.interview.coding.practice.mvp;

public class BasketBallPlayer extends Player {

    private Integer scoredPoints;
    private Integer assists;
    private Integer rebounds;

    public Integer getScoredPoints() {
        return scoredPoints;
    }

    public void setScoredPoints(Integer scoredPoints) {
        this.scoredPoints = scoredPoints;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getRebounds() {
        return rebounds;
    }

    public void setRebounds(Integer rebounds) {
        this.rebounds = rebounds;
    }
}
