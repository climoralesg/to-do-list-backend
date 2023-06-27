package com.claudio.todolist.dao;

import java.util.List;
import java.util.Map;

import com.claudio.todolist.models.Task;

public interface TaskDao {
    Task addTask(Task task); 
    List <Task> getAllTask(); 
}
