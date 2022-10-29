package com.game;

public class Player {
    private String name;
    private Integer gamesPlayed;
    private Integer totalMoves;

    public Player() {
        this.name = "Pankaj";
        this.gamesPlayed = 0;
        this.totalMoves = 0;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getGamesPlayed() {
        return gamesPlayed;
    }
    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }
    public Integer getTotalMoves() {
        return totalMoves;
    }
    public void setTotalMoves(Integer totalMoves) {
        this.totalMoves = totalMoves;
    }
    
}
