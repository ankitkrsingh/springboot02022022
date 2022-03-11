package com.example.springboot04022022;

import lombok.Builder;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.reflect.Field;
import java.util.Objects;
import java.util.stream.Stream;

@SpringBootApplication
@Slf4j
public class Springboot04022022Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot04022022Application.class, args);
    }

}