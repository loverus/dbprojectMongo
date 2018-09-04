package com.db.dbproject;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Statistic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private User user;
    private Word word;
    private int percentOfKnowledge;

    public Statistic(User user, Word word, int percentOfKnowledge) {
        this.user = user;
        this.word = word;
        this.percentOfKnowledge = percentOfKnowledge;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Word getWord() {
        return word;
    }

    public void setWord(Word word) {
        this.word = word;
    }

    public int getPercentOfKnowledge() {
        return percentOfKnowledge;
    }

    public void setPercentOfKnowledge(int percentOfKnowledge) {
        this.percentOfKnowledge = percentOfKnowledge;
    }
}
