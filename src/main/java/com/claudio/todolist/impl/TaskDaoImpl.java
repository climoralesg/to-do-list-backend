package com.claudio.todolist.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

import com.claudio.todolist.dao.TaskDao;
import com.claudio.todolist.models.Task;

@Repository
public class TaskDaoImpl implements TaskDao{
    
    @Autowired
	private MongoTemplate mongoTemplate;

    @Override
    public Task addTask(Task task){
        HashMap <String,String> result=new HashMap<>();
        System.out.println(task.toString());
        mongoTemplate.save(task);
        result.put("data","OK");
        return task;
    }

    @Override 
    public List <Task> getAllTask(){
        return mongoTemplate.findAll(Task.class);
    }

    @Override
    public Task getTask(String id){
        return mongoTemplate.findById(id, Task.class);
    }


}
