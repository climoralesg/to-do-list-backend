package com.claudio.todolist.impl;

import org.springframework.stereotype.Service;

import com.claudio.todolist.dao.HealthInterface;

import java.util.HashMap;
import java.util.Map;

@Service
public class HealthImpl implements HealthInterface {

    @Override
    public Map<String,String> health(){
        HashMap <String,String> map = new HashMap<>();
        map.put("status","OK");
        return map;
    }



}
