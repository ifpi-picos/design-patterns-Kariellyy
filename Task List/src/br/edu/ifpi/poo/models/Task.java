package br.edu.ifpi.poo.models;

import java.util.Date;

public class Task {
    public String name;
    public String description;
    public Date date;

    public Task(String name, String description, Date date) {
        this.name = name;
        this.description = description;
        this.date = date;
    }

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
        this.date = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescrition(String descrition) {
        this.description = descrition;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
