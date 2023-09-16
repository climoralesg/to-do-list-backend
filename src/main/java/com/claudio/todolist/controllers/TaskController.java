package com.claudio.todolist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.claudio.todolist.dao.TaskDao;
import com.claudio.todolist.models.Task;

@RestController
public class TaskController {
    
    @Autowired
    private TaskDao taskDao;

    @RequestMapping(value ="/tasks",method = RequestMethod.POST)
    public Task addTask(@RequestBody Task task){
        return taskDao.addTask(task);
    }

    @RequestMapping(value="/tasks",method = RequestMethod.GET)
    public List<Task> getAllTask(){
        return taskDao.getAllTask();
    }

    @RequestMapping(value = "/tasks/{id}",method = RequestMethod.GET)
    public Task geTask(@PathVariable String id){
        return taskDao.getTask(id);

    }

    @RequestMapping(value = "/tasks/{id}", method = RequestMethod.PUT)
    public Task updateTask(@RequestBody Task task, @PathVariable String id){
        return taskDao.updateTask(task, id);
    }
    


}
