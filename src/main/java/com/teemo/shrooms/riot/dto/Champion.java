package com.teemo.shrooms.riot.dto;

public class Champion {

    private boolean active; //Indicates if the champion is active.
    private boolean botEnabled; //Bot enabled flag (for custom games).
    private boolean botMmEnabled; //Bot Match Made enabled flag (for Co-op vs. AI games).
    private boolean freeToPlay; //Indicates if the champion is free to play. Free to play champions are rotated periodically.
    private long id; //Champion ID.
    private boolean rankedPlayEnabled; //Ranked play enabled flag.

    public Champion () {
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isBotEnabled() {
        return botEnabled;
    }

    public void setBotEnabled(boolean botEnabled) {
        this.botEnabled = botEnabled;
    }

    public boolean isBotMmEnabled() {
        return botMmEnabled;
    }

    public void setBotMmEnabled(boolean botMmEnabled) {
        this.botMmEnabled = botMmEnabled;
    }

    public boolean isFreeToPlay() {
        return freeToPlay;
    }

    public void setFreeToPlay(boolean freeToPlay) {
        this.freeToPlay = freeToPlay;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isRankedPlayEnabled() {
        return rankedPlayEnabled;
    }

    public void setRankedPlayEnabled(boolean rankedPlayEnabled) {
        this.rankedPlayEnabled = rankedPlayEnabled;
    }
}
