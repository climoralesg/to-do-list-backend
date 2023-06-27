package com.claudio.todolist.models;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Task{

    private String title;
    private String description;
    private boolean finished=false;
    private String state;
    private Date created = new Date();

    public Task(){
        System.out.println("Se ha creado un objeto task");
    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    @Override
    public String toString() {
        return "Task [title=" + title + ", description=" + description + ", finished=" + finished + ", state=" + state
                + ", created=" + created + "]";
    }

    
}