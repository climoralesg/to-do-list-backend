package com.claudio.todolist.dao;

import java.util.List;

import com.claudio.todolist.models.Task;

public interface TaskDao {
    Task addTask(Task task); 
    List <Task> getAllTask(); 
    Task getTask(String id); 
    Task updateTask(Task task, String idTask);
}
