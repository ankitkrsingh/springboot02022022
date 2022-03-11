package com.example.springboot04022022.controller;

import com.example.springboot04022022.entity.ToDo;
import com.example.springboot04022022.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoController {

    @Autowired
    private ToDoService toDoService;

    @GetMapping("/todos")
    public String todos() {
        return toDoService.todos();
    }

    @GetMapping("todoslist")
    public List<ToDo> todoslist() {
        return toDoService.todoslist();
    }
}
