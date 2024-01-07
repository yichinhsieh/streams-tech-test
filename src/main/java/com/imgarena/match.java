package com.imgarena;

import java.time.ZonedDateTime;
public class match {
    private int matchId;
    private ZonedDateTime startDate;
    private String playerA;
    private String playerB;
    private String summary;

    // Constructor
    public match(int matchId, ZonedDateTime startDate, String playerA, String playerB, String summary) {
        this.matchId = matchId;
        this.startDate = startDate;
        this.playerA = playerA;
        this.playerB = playerB;
        this.summary = summary;
    }

    // Getters and setters for each field
    public int getMatchId() {
        return matchId;
    }

    public ZonedDateTime getStartDate() {
        return startDate;
    }

    public String getPlayerA() {
        return playerA;
    }

    public String getPlayerB() {
        return playerB;
    }

    public String getSummary() {
        return summary;
    }
}
