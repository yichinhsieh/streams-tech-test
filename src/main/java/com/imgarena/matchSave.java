package com.imgarena;

public class matchSave {
    private int index;
    private match[] matches;

    public matchSave() {
        matches = new match[20];
        index = 0;
    }

    public int getIndex() {
        return index;
    }

    public match getMatch(int matchId) {
        for(match m : matches) {
            if (m.getMatchId() == matchId) {
                return m;
            }
        }
        return null;
    }

    public void matchSaveInArray(match m) {
        if (index < 20) {
            matches[index] = m;
            index++;
        }
    }
}
