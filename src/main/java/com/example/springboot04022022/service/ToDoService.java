package com.example.springboot04022022.service;

import com.example.springboot04022022.entity.ToDo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ToDoService {

    @Autowired
    private RestTemplate restTemplate;

    public String todos() {
        return restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", String.class);
    }

    public List<ToDo> todoslist() {
        final ToDo[] toDos = restTemplate.getForObject("https://jsonplaceholder.typicode.com/todos", ToDo[].class);
        return Arrays.asList(toDos).stream()
                .map(toDo -> {
                    if (toDo.getId() % 2 == 0) {
                        toDo.setTitle("Ich habe Hunger");
                    }
                    return toDo;
                }).collect(Collectors.toList());
    }
}
