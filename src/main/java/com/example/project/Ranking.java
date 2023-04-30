package com.example.project;

public class Ranking {
    String rank;
    String userName;
    String rating;

    public Ranking(String rank, String userName, String rating) {
        this.rank = rank;
        this.userName = userName;
        this.rating = rating;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRank() {
        return rank;
    }

    public String getUserName() {
        return userName;
    }

    public String getRating() {
        return rating;
    }
}
