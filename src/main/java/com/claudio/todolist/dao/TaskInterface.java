package com.claudio.todolist.dao;

import java.util.HashMap;
import java.util.List;

import com.claudio.todolist.models.Task;

public interface TaskInterface {
    HashMap<String, String> addTask(Task task); 
    List <Task> getAllTask(); 
    Task getTask(String id); 
    Task updateTask(Task task, String idTask);
    HashMap<String, String>  deleteTask(String idTask);
}
