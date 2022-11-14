package com.playerapp;

public class Player {
    String name;
    String sport;
    String status;

    public Player(String name, String sport, String status) {
        this.name = name;
        this.sport = sport;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
