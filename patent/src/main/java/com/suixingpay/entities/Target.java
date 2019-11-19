package com.suixingpay.entities;

import org.springframework.stereotype.Component;

@Component
public class Target {
    private int id;
    private String name;
    private int patentId;

    public Target() {
    }

    public Target(int id, String name, int patentId) {
        this.id = id;
        this.name = name;
        this.patentId = patentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPatentId() {
        return patentId;
    }

    public void setPatentId(int patentId) {
        this.patentId = patentId;
    }

    @Override
    public String toString() {
        return "Target{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", patentId=" + patentId +
                '}';
    }
}
