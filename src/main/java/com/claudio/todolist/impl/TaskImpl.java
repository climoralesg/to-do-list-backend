package com.claudio.todolist.impl;

import java.util.HashMap;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Service;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpStatus;

import com.claudio.todolist.dao.TaskInterface;
import com.claudio.todolist.exception.GeneralException;
import com.claudio.todolist.exception.NoSuchElementFound;
import com.claudio.todolist.models.Task;

@Service
public class TaskImpl implements TaskInterface {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public HashMap<String, String> addTask(Task task) {
        HashMap<String, String> result = new HashMap<>();

        try {
            mongoTemplate.save(task);
            result.put("data", "OK");
            return result;
        } catch (Exception ex) {
            throw new GeneralException("P-400", HttpStatus.BAD_REQUEST, ex.getMessage());
        }

    }

    @Override
    public List<Task> getAllTask() {
        try {
            return mongoTemplate.findAll(Task.class);
        } catch (Exception ex) {
            throw new GeneralException("P-400", HttpStatus.BAD_REQUEST, ex.getMessage());
        }

    }

    @Override
    public Task getTask(String id) {
        Task task = mongoTemplate.findById(id, Task.class);

        if (task == null) {
            throw new NoSuchElementFound("P-404", HttpStatus.NOT_FOUND, "task not found");
        }
        return task;
    }

    @Override
    public Task updateTask(Task task, String idTask) {

        Query query = new Query();
        try {
            query.addCriteria(Criteria.where("_id").is(idTask));

            Task existingTask = mongoTemplate.findById(idTask, Task.class);

            if (existingTask != null) {
                Update update = new Update();
                update.set("title", task.getTitle());
                update.set("description", task.getDescription());
                update.set("state", task.getState());

                mongoTemplate.updateFirst(query, update, Task.class);
            } else {
                throw new NoSuchElementFound("P-404", HttpStatus.NOT_FOUND, "task not found");
            }
            return mongoTemplate.findById(idTask, Task.class);
        } catch (Exception ex) {
            throw ex;
        }
    }

    @Override 
    public HashMap<String, String> deleteTask(String idTask){
        HashMap<String, String> result = new HashMap<>();
        Query query = new Query();

        try{
            query.addCriteria(Criteria.where("_id").is(idTask));
            mongoTemplate.findAndRemove(query, Task.class);            
            result.put("data", "OK");
            return result;
        }catch(Exception ex){
            throw ex;
        }
    }

}
