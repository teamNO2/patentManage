package com.suixingpay.entities;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class History {
    private int id;
    private Date curDate;
    private String term;
    private String person;

    public History() {
    }

    public History(int id, Date curDate, String term, String person) {
        this.id = id;
        this.curDate = curDate;
        this.term = term;
        this.person = person;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCurDate() {
        return curDate;
    }

    public void setCurDate(Date curDate) {
        this.curDate = curDate;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "History{" +
                "id=" + id +
                ", curDate=" + curDate +
                ", term='" + term + '\'' +
                ", person='" + person + '\'' +
                '}';
    }
}
