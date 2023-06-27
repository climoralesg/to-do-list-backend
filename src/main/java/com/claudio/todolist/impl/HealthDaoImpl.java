package com.claudio.todolist.impl;

import com.claudio.todolist.dao.HealthDao;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class HealthDaoImpl implements HealthDao {

    @Override
    public Map<String,String> health(){
        HashMap <String,String> map = new HashMap<>();
        map.put("status","OK");
        return map;
    }



}
