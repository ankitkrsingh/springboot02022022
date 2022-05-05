package com.example.springboot04022022.controller;

import com.example.springboot04022022.entity.ToDo;
import com.example.springboot04022022.service.ToDoService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ToDoController {

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
