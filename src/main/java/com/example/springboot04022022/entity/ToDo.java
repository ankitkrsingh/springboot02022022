package com.example.springboot04022022.entity;

import lombok.Data;

@Data
public class ToDo {
    private Long userId;
    private Long id;
    private String title;
    private boolean completed;
}
