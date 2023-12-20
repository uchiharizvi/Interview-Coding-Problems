package com.interview.coding.practice.mvp;

public class HandBallPlayer extends Player {

    private Integer goalsMade;
    private Integer goalsReceived;

    public Integer getGoalsMade() {
        return goalsMade;
    }

    public void setGoalsMade(Integer goalsMade) {
        this.goalsMade = goalsMade;
    }

    public Integer getGoalsReceived() {
        return goalsReceived;
    }

    public void setGoalsReceived(Integer goalsReceived) {
        this.goalsReceived = goalsReceived;
    }
}
