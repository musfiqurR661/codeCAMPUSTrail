package com.example.project;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RankingTest {
    @Test
    void gettersReturnConstructorValues() {
        Ranking ranking = new Ranking("01", "alice", "10", "1500");
        assertEquals("01", ranking.getRank());
        assertEquals("alice", ranking.getUserName());
        assertEquals("10", ranking.getNumContest());
        assertEquals("1500", ranking.getRating());
    }
}
