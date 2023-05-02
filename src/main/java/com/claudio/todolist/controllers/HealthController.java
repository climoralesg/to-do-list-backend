package com.claudio.todolist.controllers;

import com.claudio.todolist.dao.HealthDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HealthController {
    @Autowired
    private HealthDao healthDao;

    @RequestMapping(value = "/health", method = RequestMethod.GET)
    @ResponseBody
    public Map <String,String> health(){
        return healthDao.health();
    }
}
