package com.claudio.todolist.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Task{
    
    //we can change to ObjectId object and we will see it in another format
    @Id
    private String _id;
    private String title;
    private String description;
    private boolean finished=false;
    private String state;
    private Date created = new Date();  

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Task(){
        System.out.println("Created new object type task");
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